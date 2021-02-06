package homework;

import java.util.ArrayList;

public class ThreeCollectionsMain {
    public static void main(String[] args) {
        //Creating Array of 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(2);
        numbers.add(3);
        numbers.add(11);
        numbers.add(15);
        numbers.add(100);
        numbers.add(23);

        //Creating Array of 10 names
        ArrayList<String> names = new ArrayList<>();
        names.add("Igor");
        names.add("Olga");
        names.add("Piotr");
        names.add("John");
        names.add("Josh");
        names.add("Ron");
        names.add("Germiona");
        names.add("Garry");
        names.add("Toby");
        names.add("Lokk");

        //Creating Array of "number" + "name"
        ArrayList<String> sumArray = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            sumArray.add(numbers.get(i) + " - " + names.get(i));
        }

        for (String i: sumArray) {
            System.out.println(i);
        }
    }
}
