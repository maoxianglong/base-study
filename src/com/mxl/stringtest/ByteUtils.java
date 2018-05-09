package com.mxl.stringtest;

public class ByteUtils {

    public static final int bytesToInt(byte abyte0[], int i, int j) {//00000001 00000010 00000011 00000100
        int k = 0;
        for (int l = 0; l < j; l++) {
            k = k << 8 | abyte0[l + i] & 0xff;
        }
        return k;
    }

    public static final void flagTest(int num) {
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num);
        num = num << 8;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num);
    }

    public static final void show(){
        int[] nums;
        nums = new int[]{0x01, 0x02, 0x03, 0x04};
        int[] data = new int[nums.length];
        System.arraycopy(nums, 0, data, 0, nums.length);
            for (int i = 0; i < data.length; i++) {
            System.out.println(Integer.toBinaryString(data[i]|0xff));
            System.out.println(data[i]|0xff);
        }
    }

    public static final void show2(){
        byte a = 127;
        a+=1;
        System.out.println(a);
    }

    public static final void show3(){
        byte a = -128;
        a-=1;
        System.out.println(a);
    }

    public static void main(String[] args) {
//        byte abyte0[] = {0x01,0x02,0x03,0x04};//00000001 00000010 00000011 00000100
//        int index = bytesToInt(abyte0,0,3);
//        System.out.println(index);
//        flagTest(0xff);
        show2();
        show3();
    }


}
