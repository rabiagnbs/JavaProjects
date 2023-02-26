package DIZILER;

import java.util.Arrays;

public class ElemanlariSiralama {
    public static void sirala(int[] arr){
        int temp=0;
        for(int j=0; j<arr.length-1; j++){
            for(int i=0; i<arr.length-1; i++){
                if( arr[i] > arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] dizi={1,4,5,6,7,9,3,0};
        sirala(dizi);
        System.out.println("array ordered from smallest to largest:");
        System.out.print(Arrays.toString(dizi));
    }
}
