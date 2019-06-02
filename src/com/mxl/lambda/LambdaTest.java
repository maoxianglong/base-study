package com.mxl.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LambdaTest {

    public void show() {
        List<String> persons = new ArrayList<>();
        persons.add("MAO");
        persons.add("Xiang");
        List<String> lcPersons = persons.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lcPersons.get(0));
    }

    public void pattern() {

        /**
         * CASE_INSENSITIVE 不区分大小写
         * LITERAL 字面意思
         */
        Pattern pattern = Pattern.compile("xianglong",Pattern.CASE_INSENSITIVE|Pattern.LITERAL);
        Matcher matcher1 = pattern.matcher("XIANGLONG");
        Matcher matcher2 = pattern.matcher("xianglong");
        Matcher matcher3 = pattern.matcher("longlong");
        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());

    }

    public static void testLam(){
        Function<Person,String> getPersonName = person ->  {
            return person.getName();
        };

        Person person1 = new Person("Mike","ShangHai");
        Person person4 = new Person("Jerry","ShangHai");
        Person person2 = new Person("LI","New York");
        Person person3 = new Person("Curry","Tokoy");

        List<Person> persons = new ArrayList<>();

//        System.out.println(Arrays.asList(new Person("Mike","ShangHai"),
//                new Person("LI","New York")
//                ,new Person("Curry","Tokoy")
//                ,new Person("Jerry","ShangHai")).stream()
//                .filter(person -> person.getAddress().equals("ShangHai"))
//                .map(getPersonName)
//                .collect(Collectors.joining("|")));

        System.out.println(Arrays.asList(new Person("Mike","ShangHai"),
                new Person("LI","New York")
                ,new Person("Curry","Tokoy")
                ,new Person("Jerry","ShangHai")).stream()
                .filter(person -> person.getAddress().equals("ShangHai"))
                .map(person -> person.getName())
                .collect(Collectors.joining("|")));

//        Arrays.asList("longlong","huihui","liangliang").stream().map(String::toUpperCase).forEach(x ->{
//            System.out.println(x);
//        });
//
//        System.out.println(Arrays.asList("longlong","huihui","liangliang").stream().map(String::toUpperCase).collect(Collectors.joining("|")));

    }

    public static void main(String[] args) {
//        pattern();

        testLam();
    }

}

class Person{

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}