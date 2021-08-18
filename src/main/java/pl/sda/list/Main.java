package pl.sda.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("First string");
        arrayList.add("First string");
        arrayList.add("Second string");

        System.out.println(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("First string");
        linkedList.add("First string");
        linkedList.add("Second string");

        System.out.println(linkedList);
    }
}
