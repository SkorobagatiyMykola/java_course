package ua.skorobahatyi.lesson_8_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_testr {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
    }
}
