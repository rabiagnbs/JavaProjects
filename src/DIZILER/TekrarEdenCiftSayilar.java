package DIZILER;

import java.util.Arrays;

public class TekrarEdenCiftSayilar {

    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {


        int[] sayilar={1,2,3,3,2,4,5,6,6,8,4};
        int[] tekrar=new int[10];
        int sayac=0;
         for(int i=0; i<sayilar.length; i++){
             if(sayilar[i]%2==0){
                 for(int j=0; j<sayilar.length; j++){

                     if(!isFind(tekrar, sayilar[i])){
                         if(i!=j && sayilar[i]==sayilar[j]){

                             tekrar[sayac++]=sayilar[i];
                         }
                     }
                 }
             }
         }
         System.out.println(Arrays.toString(tekrar));
    }
}
