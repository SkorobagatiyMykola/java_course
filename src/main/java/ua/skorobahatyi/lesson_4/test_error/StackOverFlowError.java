package ua.skorobahatyi.lesson_4.test_error;

public class StackOverFlowError {
    public static void main(String[] args) {
        main(args);
        StackOverflowError stackOverflowError = new StackOverflowError();
    }
}
