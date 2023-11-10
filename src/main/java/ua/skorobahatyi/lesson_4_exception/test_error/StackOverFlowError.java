package ua.skorobahatyi.lesson_4_exception.test_error;

public class StackOverFlowError {
    public static void main(String[] args) {
        main(args);
        StackOverflowError stackOverflowError = new StackOverflowError();
    }
}
