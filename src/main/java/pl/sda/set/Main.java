package pl.sda.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String... args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("first string");
        hashSet.add("second string");
        hashSet.add("third string");
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("first string");
        treeSet.add("second string");
        treeSet.add("third string");
        System.out.println(treeSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("first string");
        linkedHashSet.add("second string");
        linkedHashSet.add("third string");
        System.out.println(linkedHashSet);
    }
}
