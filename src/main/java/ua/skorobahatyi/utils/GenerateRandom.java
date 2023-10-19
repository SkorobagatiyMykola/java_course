package ua.skorobahatyi.utils;

import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int upper=random.nextInt(100);
            System.out.println(upper);
        }


    }
}
