package ua.skorobahatyi.lesson_4_exception.test_unchecked_exception;

import java.util.LinkedList;
import java.util.List;

public class ArrayIndexOutOfBoundsExceptionTest {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};
        System.out.println(array[22]);
        //ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        //System.out.println(array[5]);
        Integer[] array2 = {0,1,2,3};
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //LinkedList<Integer> list = Arrays.asList(array2);

        System.out.println(list.get(3));
        System.out.println(list.get(5)); //ArrayIndexOutOfBoundsExceptionTest.java:23
    }
}
