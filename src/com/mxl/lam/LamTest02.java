package com.mxl.lam;

import java.util.ArrayList;
import java.util.List;

public class LamTest02 {

    private static List<Stu> stus = new ArrayList<>();

    {
        for (int i = 0; i<10; i++){
            stus.add(new Stu(i,"xianglong" + i));
        }

    }

    public static void main(String[] args) {
        new LamTest02().testFindAny();
    }


    /**
     * 测试findAny的查找机制
     */
    public void testFindAny(){

        stus.stream().filter(stu -> stu.getAge() > 5).findAny().ifPresent(stu -> System.out.println(stu.getNickName()));

    }

}


class Stu{

    private Integer age;
    private String nickName;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Stu(Integer age, String nickName) {
        this.age = age;
        this.nickName = nickName;
    }
}
