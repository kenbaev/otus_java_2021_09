package ru.otus;

import com.google.common.collect.Sets;

import java.util.Random;
import java.util.TreeSet;

public class HelloOtus {
    private static final int RANDOM_COUNT = 100;
    private static final int UPPER_INT = 1000;
    private static TreeSet<Integer> exampleSet = Sets.newTreeSet();

    private static void fillSetWithRandom() {
        Random randomGenerator = new Random();
        for (int i = 0; i < RANDOM_COUNT; i++) {
            exampleSet.add(randomGenerator.nextInt(UPPER_INT));
        }
    }

    private static void printSet() {
        System.out.println("Set content:");
        System.out.println(exampleSet);
    }

    public static void main(String... args) {
        fillSetWithRandom();
        printSet();
    }
}
