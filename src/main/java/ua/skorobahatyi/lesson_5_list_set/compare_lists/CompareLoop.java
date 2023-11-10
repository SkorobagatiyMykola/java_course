package ua.skorobahatyi.lesson_5_list_set.compare_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareLoop {
    private static int COUNT = 1_00_000_000;

    public static void main(String[] args) {
        List<Integer> listArr = new ArrayList<>();
        //List<String> listArr = new ArrayList<>();

        for (int i = 0; i < COUNT; i++) {
            //listArr.add("test_"+i);
            listArr.add(i);
        }


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            int tt = listArr.get(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("In an ArrayList, fori loop " + COUNT + " elements are added in " + (endTime1 - startTime1) + " ms.");

        long startTime2 = System.currentTimeMillis();
        for (Integer tt : listArr) {
            int tt1 = tt;
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println("In an ArrayList, foreach loop " + COUNT + " elements are added in " + (endTime2 - startTime2) + " ms.");
    }
}
