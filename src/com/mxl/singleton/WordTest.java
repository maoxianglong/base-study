package com.mxl.singleton;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Random;

public class WordTest {

    public static void main(String[] args) throws UnsupportedEncodingException {

//        String word = "ÄãºÃ";
//        String english = "AB";
//        System.out.println(word.getBytes("utf-8").length);
//        System.out.println(english.getBytes("utf-8").length);

        WordTest wordTest = new WordTest();

        for (int i = 0; i<1000; i++){
            wordTest.show();
        }

    }

    public void show(){

//        String nonce = Integer.toString(new Random().nextInt(999999));
//
//        String.format("%06d",new Random().nextInt(999999));
        System.out.println(String.format("%06d",new Random().nextInt(999999)));

    }

}
