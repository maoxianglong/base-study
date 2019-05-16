package com.mxl.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestFunctionInterface {

    public static void main(String[] args) {

//        ReadBook<Book> readBook = x -> {return x.getBookName();};

//        System.out.println(getBookName(x -> {
//            return x.getBookName();
//        }));
//
//        System.out.println(isRead(x -> x.getBookName()
//                        .equals("Java Effective"), new Book("Java Effective")));
//
//
//        String witheWord = "改开:改开体育场,改开车,改开始,改开幼儿园,改开会,改开飞机;美分:十美分;炮架:意大利炮架;八酒:八酒杯;老虎:油老虎,老虎滩;大局意识:比赛大局意识,阅读大局意识,后卫大局意识,球有大局意识,大局意识好;工会:球员工会;女优:千年女优;TANK:stank;白粉:蛋白粉,白粉末,白粉笔,白粉底,白粉霜;反国家:违反国家;抗争:抗争命运,命运抗争;外围:禁区外围,外围压力,外围防守,外围赛,外围设备,来到外围;286:0286,1286,2286,3286,4286,5286,6286,7286,8286,9286,2860,2861,2862,2863,2864,2865,2866,2867,2868,2869,*286,/286,286*,286/,a286,b286,c286,d286,e286,f286,g286,h286,i286,j286,k286,l286,m286,n286,o286,p286,q286,r286,u286,v286,w286,x286,y286,z286,286a,286b,286c,286d,286e,286f,286g,286h,286i,286j,286k,286l,286m,286n,286o,286p,286q,286r,286s,286t,286u,286v,286w,286x,286y,286z,286+,286-,+286,-286,s286,t286;压榨:压榨油;全面碾压:实力全面碾压;民生:民生银行,民生信用卡;";
//
//        Map<String,List<String>> listList = Arrays.stream(witheWord.split(";")).collect(Collectors.toMap(e -> e.split(":")[0], e -> Arrays.asList(e.split(":")[1].split(","))));
//
//        Arrays.stream(listList.keySet().toArray()).forEach(x -> {
//            System.out.println(x);
//        });
//
//        listList.values().stream().forEach(x -> {
//            x.stream().forEach(y -> {
//                System.out.print(y);
//            });
//            System.out.println("");
//        });
//
//        new Thread(() -> System.out.println("我是一个线程...")).start();

        String data = "123,456,789,000,111,abf %s";

        String newdata = Arrays.stream(data.split(",")).collect(Collectors.joining("|"));

        System.out.println(newdata);

        System.out.println(String.format(data,"bbb"));

    }

    public static String getBookName(ReadBook<Book> readBook) {
        Book book = new Book("Java Effective");
        book.setBookName("Java Effective");
        return readBook.getBookName(book);
    }

    public static Boolean isRead(Predicate<? super Book> predicate, Book book) {

        return predicate.test(book);

    }


}

class Book {

    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
