package main;

public class MyArrayList {

    private String[] array = new String[10];
    private int size = 0;

    public void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("The element is not found");
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }
        }
        remove(index);
    }

    public int getSize() {
        return size;
    }

    public String getName(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "The element is not found";
        }
    }
}
