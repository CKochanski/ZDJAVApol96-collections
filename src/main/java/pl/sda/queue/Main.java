package pl.sda.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String... args) {
        Queue<String> shopQueue = new LinkedList<>();

        shopQueue.offer("Tony Stark");
        shopQueue.offer("Steven Rogers");
        shopQueue.offer("Bruce Banner");

        System.out.println(shopQueue);

        String firstInQueue = shopQueue.poll();

        System.out.println("Do sklepu wchodzi " + firstInQueue);

        System.out.println(shopQueue);
    }
}
