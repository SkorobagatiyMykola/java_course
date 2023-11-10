package ua.skorobahatyi.lesson_4_exception.test_error;

public class MemoryError {
    public static void main(String[] args) {
        int[] array = new int[Integer.MAX_VALUE];
        OutOfMemoryError t=new OutOfMemoryError();
    }
}
