package com.mxl.lam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamTest {

    List<String> content = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    List<Person> persons = new ArrayList<>();

    {
        content.add("AAAA");
        content.add("BBB");
        content.add("cc");

        numbers.add(5);
        numbers.add(-5);
        numbers.add(99);
        numbers.add(199);
        numbers.add(1999);
    }

    public void sort(){

        List<String> data = content.stream().sorted((x,y) -> {
            return Integer.compare(x.length(),y.length());
        }).collect(Collectors.toList());

        List<Integer> data2 = numbers.stream().sorted((x,y) -> {

            System.out.print("x :" + x);
            System.out.print("y :" + y);

            Integer c = Integer.compare(x,y);
            System.out.println("c :" + c);
            return c;

        }).collect(Collectors.toList());

//        data2.stream().forEach(c -> {
//            System.out.println(c);
//        });
        data.stream().forEach(c -> {
            System.out.println(c);
        });

    }

    public static void main(String[] args) {
        LamTest lamTest = new LamTest();
        lamTest.sort();
    }

    class Person{

        private String id;
        private String name;
        private Integer age;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

}
