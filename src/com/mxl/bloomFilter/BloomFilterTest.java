<<<<<<< HEAD
package com.mxl.bloomFilter;

//import com.google.common.hash.BloomFilter;
//import com.google.common.hash.Funnels;

import java.util.HashSet;
import java.util.UUID;

/**
 * @author MAO
 * @Date 2018-05-09
 */
public class BloomFilterTest {

//    private static BloomFilter<Integer> bf = null;
    private static HashSet<Integer> set = null;
    private static final Integer NUMBER = 1000000;

    private static void addEletoBloomFilter(){

        //采用工厂方法实例化BloomFilter对象
        //第一个参数:布隆过滤器的泛型，实际场景中一般用来存放用户唯一编码，即userCode
        //第二个参数:布隆过滤器的容量，一般容量设置为实际容量的1.5倍，因为布隆过滤器的算法
        // 复杂，存放容易，删除一个元素很复杂，所以预设容量最好是实际容量的1.2-1.5倍
        //第三个参数:布隆过滤器的误伤率，默认是0.03。布隆过滤器由于使用哈希函数(hsah function)的
        // 过滤机制，算法复杂，其存在一定的hash碰撞率,存在一定的误伤率，这个误伤率可以
        // 设置，误伤率越小，采用的哈希函数越多，所需容量自然就越大，越准确，根据实际场景
        //设置。
=======
//package com.mxl.bloomFilter;
//
//import com.google.common.hash.BloomFilter;
//import com.google.common.hash.Funnels;
//
//import java.util.HashSet;
//import java.util.UUID;
//
//*
// * @author MAO
// * @Date 2018-05-09
//
//
//public class BloomFilterTest {
//
//    private static BloomFilter<Integer> bf = null;
//    private static HashSet<Integer> set = null;
//    private static final Integer NUMBER = 1000000;
//
//    private static void addEletoBloomFilter(){
//
//        //采用工厂方法实例化BloomFilter对象
//        //第一个参数:布隆过滤器的泛型，实际场景中一般用来存放用户唯一编码，即userCode
//        //第二个参数:布隆过滤器的容量，一般容量设置为实际容量的1.5倍，因为布隆过滤器的算法
//        // 复杂，存放容易，删除一个元素很复杂，所以预设容量最好是实际容量的1.2-1.5倍
//        //第三个参数:布隆过滤器的误伤率，默认是0.03。布隆过滤器由于使用哈希函数(hsah function)的
//        // 过滤机制，算法复杂，其存在一定的hash碰撞率,存在一定的误伤率，这个误伤率可以
//        // 设置，误伤率越小，采用的哈希函数越多，所需容量自然就越大，越准确，根据实际场景
//        //设置。
>>>>>>> origin/master
//        bf = BloomFilter.create(Funnels.integerFunnel(),NUMBER,0.001);
//
//        for (int i =0; i < NUMBER; i++){
//            bf.put(i);
//        }
<<<<<<< HEAD

    }

    private static void addEleToHashSet(){

        set = new HashSet<Integer>();

        for(int i = 0; i < NUMBER; i++){
            set.add(i);
        }
    }

    public static void main(String[] args) {

        Integer flag = -1;
        int right = 0;
        int wrong = 0;
        addEletoBloomFilter();
        addEleToHashSet();

        for (int i = 1; i < 9999; i++){

            if(i%100 == 0){
                flag = i/100;
            }else {
                flag = UUID.randomUUID().hashCode();
            }

=======
//
//    }
//
//    private static void addEleToHashSet(){
//
//        set = new HashSet<Integer>();
//
//        for(int i = 0; i < NUMBER; i++){
//            set.add(i);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Integer flag = -1;
//        int right = 0;
//        int wrong = 0;
//        addEletoBloomFilter();
//        addEleToHashSet();
//
//        for (int i = 1; i < 9999; i++){
//
//            if(i%100 == 0){
//                flag = i/100;
//            }else {
//                flag = UUID.randomUUID().hashCode();
//            }
//
>>>>>>> origin/master
//            if (bf.mightContain(flag)){
//                if(set.contains(flag)){
//                    right++;
//                }else{
//                    wrong++;
//                }
//            }
<<<<<<< HEAD

        }

        System.out.println("正确：" + right);
        System.out.println("错误：" + wrong);
    }

}
=======
//
//        }
//
//        System.out.println("正确：" + right);
//        System.out.println("错误：" + wrong);
//    }
//
//}
>>>>>>> origin/master
