package DIZILER;

import java.util.Arrays;

public class tekrarEdenSayilar {

    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void again(int[] arr){
        int[] again=new int[arr.length];
        int sayac=0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++) {
                if (!isFind(again, arr[i])) {
                    if (i != j && arr[i] == arr[j]) {
                        again[sayac++] = arr[i];
                    }
                }
            }
        }
        System.out.println("tekrar eden elemanlar:");
        System.out.println(Arrays.toString(again));
    }


    public static void main(String[] args) {
        int[] dizi={1,3,6,7,2,1,7,2};
        System.out.println("dizideki elemanlar:");
        System.out.println(Arrays.toString(dizi));
        again(dizi);
    }
}
