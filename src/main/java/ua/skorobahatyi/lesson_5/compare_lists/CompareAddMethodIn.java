package ua.skorobahatyi.lesson_5.compare_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CompareAddMethodIn {
    private static int COUNT_DEFAULT_ELEMENTS = 1_000_000;
    private static int COUNT_OPERATION = 10_000;

    public static void main(String[] args) {
        List<Integer> listArr = new ArrayList<>();
        List<Integer> listLink = new LinkedList<>();
        Random random = new Random();
        int index;

        for (int i = 0; i < COUNT_DEFAULT_ELEMENTS; i++) {
            listArr.add(i);
            listLink.add(i);
        }
        System.out.println("======================");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT_OPERATION; i++) {
            index = random.nextInt(COUNT_DEFAULT_ELEMENTS);
            listArr.add(index,i);

        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("In an ArrayList, " + COUNT_OPERATION + " elements are added in " + (endTime1 - startTime1) + " ms.");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < COUNT_OPERATION; i++) {
            index = random.nextInt(COUNT_DEFAULT_ELEMENTS);
            listLink.add(index,i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("In an LinkedList, " + COUNT_OPERATION + " elements are added in " + (endTime2 - startTime2) + " ms.");


    }
}
