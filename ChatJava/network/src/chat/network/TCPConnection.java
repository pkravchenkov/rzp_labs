package chat.network;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;

public class TCPConnection {


    private final Socket socket;
    private final Thread recieveThread;
    private final TCPConnectionListener EventListener;
    private final BufferedReader in;
    private final BufferedWriter out;

    public TCPConnection(TCPConnectionListener eventListener, String ipAddress, int port)throws IOException{
    this(eventListener, new Socket(ipAddress, port));
    }

    public TCPConnection(TCPConnectionListener EventListener, Socket socket) throws IOException {
        this.EventListener = EventListener;
        this.socket=socket;
        in =  new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.forName("UTF-8")));
        out =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), Charset.forName("UTF-8")));
        recieveThread =  new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    EventListener.onConnectionReady(TCPConnection.this);
                    while(!recieveThread.isInterrupted()){
                        EventListener.onRecieveString(TCPConnection.this, in.readLine());
                    }

                } catch (IOException e) {
                   EventListener.onException(TCPConnection.this, e);
                }
                finally {
                    EventListener.onDisconnect(TCPConnection.this);
                }
            }
        });
        recieveThread.start();
    }

    public synchronized void sendMessage(String value){
        try {
            out.write(value+"\r\n");
            out.flush();
        } catch (IOException e) {
            EventListener.onException(TCPConnection.this, e);
            disconnect();
        }

    }
    public synchronized void disconnect() {
        recieveThread.interrupt();
        try {
            socket.close();
        } catch (IOException e) {
           EventListener.onException(TCPConnection.this, e);
        }

    }


    @Override
    public String toString(){
        return "TCPConnection: "+socket.getInetAddress()+": "+socket.getPort();
    }

}
