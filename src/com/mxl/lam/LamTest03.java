package com.mxl.lam;

import java.util.Arrays;
import java.util.function.Function;

public class LamTest03 {

    public void show(){

    }



    public static void main(String[] args) {
        Function<String,Integer> getStrLen = x -> {
            return x.length();
        };

        Arrays.asList("mao","xianglong","long").stream()
                .map(String::length).filter(length -> length > 2).findAny().ifPresent(x -> System.out.println(x));
//                .collect(Collectors.toList())
//                .forEach(len -> System.out.println(len));
    }

}
