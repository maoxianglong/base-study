package com.mxl.deque;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeTest {

    private static final LinkedBlockingDeque deque = new LinkedBlockingDeque();

    private static final ArrayList<String> array = new ArrayList<>();

    /**
     * LinkedBlockingDeque中的take()方法和put()方法会阻塞一段时间，会嗲用Condition实例NotEmpty和NotFull的await方法
     * 该方法会阻塞调用该方法的线程，知道有元素放入或者有多余的空间存放元素的时候。
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 running..." + System.currentTimeMillis());
                deque.add("1");
//                array.add("abc");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2 running..." + System.currentTimeMillis());
                String a = null;
                try {
                    System.out.println("此时队列包含元素数量：" + deque.size() + " : " + System.currentTimeMillis());
                    a = (String) deque.peek();
                    System.out.println(a);
                    System.out.println("后来队列包含元素数量：" + deque.size() + " : " +System.currentTimeMillis());
                } catch (Exception e) {
                    e.printStackTrace();
                }
//                System.out.println(array.size());
            }
        });

        t2.start();
        Thread.sleep(10000);
        t1.start();
    }

}
