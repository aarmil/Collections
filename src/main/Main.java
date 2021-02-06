package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> names = new TreeSet<>();
        names.add(3);
        names.add(4);
        names.add(12);
        names.add(5);
        names.add(1);

        for (Integer name: names) {
            System.out.println(name);
        }
    }
}
