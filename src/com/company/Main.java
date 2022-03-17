package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
     
        Random random = new Random();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            a.add(random.nextInt(15));
        }
        System.out.println(a);

        a.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);
    }
}
