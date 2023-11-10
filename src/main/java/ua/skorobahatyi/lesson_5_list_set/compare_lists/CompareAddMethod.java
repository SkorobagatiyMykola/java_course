package ua.skorobahatyi.lesson_5_list_set.compare_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareAddMethod {
    private static int COUNT = 1_00_000;
    public static void main(String[] args) {
//        List<Integer> listArr = new ArrayList<>();
//        List<Integer> listLink = new LinkedList<>();
        List<String> listArr = new ArrayList<>();
        List<String> listLink = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            listArr.add(0,"test_"+i);
            //listArr.add("test_"+i);
            //listArr.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("In an ArrayList, "+COUNT+" elements are added in "+ (endTime1-startTime1)+" ms.");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            listArr.add(0,"test_"+i);
            //listLink.add("test_"+i);
            //listLink.add(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("In an LinkedList, "+COUNT+" elements are added in "+ (endTime2-startTime2)+" ms.");
    }
}
