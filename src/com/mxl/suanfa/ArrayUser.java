package com.mxl.suanfa;

public class ArrayUser {


    public static void main(String[] args) {

        int[] numbers1 = new int[5];
        numbers1[2] = 9;
        numbers1[3] = 5;
        numbers1[4] = 4;

        int[] numbers2 = new int[5];
        numbers2[2] = 1;
        numbers2[3] = 2;
        numbers2[4] = 7;

        int number = 10;

        int[] result = new int[100];

        result = arrayMuit(numbers1,numbers2);

        for (int i = 0; i<result.length;i++){
            System.out.print(result[i]);
        }


    }

    public static int[] arrayMuit(int[] nums, int number){
        int nums2[] = new int[10];
        for (int i = 0; i < nums.length; i++){
            nums2[nums2.length - i - 1] = nums[nums.length - i - 1] * number;
        }

        for (int i = nums2.length - 1; i > 0; i--){
            nums2[i-1] += nums2[i]/10;
            nums2[i] %= 10;
        }

        int length = 0;
        for (int i = 0 ; i < nums2.length; i++){
            if (nums2[i] == 0){
                length++;
            }else {
                break;
            }
        }

        int newlength = nums2.length - length;
        int[] newnumbers = new int[newlength];
        for (int i = 0; i < newlength; i++){
            newnumbers[newlength - i - 1] = nums2[nums2.length - i - 1];
        }
        return newnumbers;

    }

    public static int[] arrayMuit(int[] number1, int[] number2){

        int[] sum = new int[20];
        int[] result = new int[50];

        for (int i = number1.length - 1; i > 0; i--){
            for (int j = number2.length - 1; j > 0; j--){
                sum[sum.length - (number2.length - j)] = ((number1[i]*pow(number1[i],number1.length - i -1))) * number2[j];
            }

            for (int s = sum.length - 1; s > 0; s--){
                sum[s-1] += sum[s]/10;
                sum[s] %= 10;
            }

            for (int w = sum.length - 1; w > 0; w--){
                result[result.length - (sum.length - w)] += sum[w];
                sum[w] = 0;
            }
        }

        for (int i = result.length - 1; i > 0; i--){
            result[i-1] += result[i]/10;
            result[i] %= 10;
        }

        int length = 0;
        for (int i = 0 ; i < result.length; i++){
            if (result[i] == 0){
                length++;
            }else {
                break;
            }
        }

        int newlength = result.length - length;
        int[] newnumbers = new int[newlength];
        for (int i = 0; i < newlength; i++){
            newnumbers[newlength - i - 1] = result[result.length - i - 1];
        }
        return newnumbers;
    }

    public static int pow(int number, int pow){
        int pp = 1;
        if (pow == 0){
            return 1;
        }
        for (int i = 0; i < pow; i++){
            pp *= 10;
        }
        return pp;
    }

//    public static int[] arrayChu(int[] nums, int number){
//
//        for(int i = 0; i < nums.length; i++){
//            nums[nums.length - i -1]/10;
//        }
//
//    }


}
