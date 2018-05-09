package com.mxl.sort;

public class MaoPaoSort {


    public static int[] sort(int[] data){
        for(int i = 0;i<data.length;i++){
            for(int j = 0;j<data.length-1;j++){
                if (data[j]>data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }

        return data;
    }

    public static void main(String[] args) {
        int[] content = {3,6,9,8,1,0,2,6,5};
        int[] result = sort(content);
        for (int a:result){
            System.out.print(a+",");
        }
    }

}
