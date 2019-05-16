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
//        String witheWord = "�Ŀ�:�Ŀ�������,�Ŀ���,�Ŀ�ʼ,�Ŀ��׶�԰,�Ŀ���,�Ŀ��ɻ�;����:ʮ����;�ڼ�:������ڼ�;�˾�:�˾Ʊ�;�ϻ�:���ϻ�,�ϻ�̲;�����ʶ:���������ʶ,�Ķ������ʶ,���������ʶ,���д����ʶ,�����ʶ��;����:��Ա����;Ů��:ǧ��Ů��;TANK:stank;�׷�:���׷�,�׷�ĩ,�׷۱�,�׷۵�,�׷�˪;������:Υ������;����:��������,���˿���;��Χ:������Χ,��Χѹ��,��Χ����,��Χ��,��Χ�豸,������Χ;286:0286,1286,2286,3286,4286,5286,6286,7286,8286,9286,2860,2861,2862,2863,2864,2865,2866,2867,2868,2869,*286,/286,286*,286/,a286,b286,c286,d286,e286,f286,g286,h286,i286,j286,k286,l286,m286,n286,o286,p286,q286,r286,u286,v286,w286,x286,y286,z286,286a,286b,286c,286d,286e,286f,286g,286h,286i,286j,286k,286l,286m,286n,286o,286p,286q,286r,286s,286t,286u,286v,286w,286x,286y,286z,286+,286-,+286,-286,s286,t286;ѹե:ѹե��;ȫ����ѹ:ʵ��ȫ����ѹ;����:��������,�������ÿ�;";
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
//        new Thread(() -> System.out.println("����һ���߳�...")).start();

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
