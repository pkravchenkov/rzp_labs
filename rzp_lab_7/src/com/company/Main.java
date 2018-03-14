package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> apple = new ArrayList<String>();
        List<String> car = new ArrayList<String>();
        List<String> cat = new ArrayList<String>();
        Map<String, List> map = new HashMap<>();

        apple.add("Apple");
        apple.add("Apfel");
        map.put("Яблоко",apple);

        car.add("Car");
        car.add("Wagen");
        map.put("Автомобиль", car);

        cat.add("Cat");
        cat.add("Kater");
        map.put("Кот", cat);

        System.out.println(map.get("Яблоко"));
        System.out.println(map.get("Автомобиль"));
        System.out.println(map.get("Кот"));
    }
}
