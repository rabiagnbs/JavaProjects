package DIZILER;
import java.util.Arrays;
import java.util.Scanner;

public class EnBuyukEnKucuk {


    public static void main(String[] args) {
        int[] dizi= new int[]{15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi: ");
        System.out.println(Arrays.toString(dizi));
        Arrays.sort(dizi);
        System.out.println("Dizinin sıralanmış hali: ");
        System.out.println(Arrays.toString(dizi));
        System.out.println("Dizide istediginiz sayiyi giriniz:");
        Scanner input= new Scanner(System.in);
        int value=input.nextInt();
        for (int i=0; i<=dizi.length-1; i++){
            if(dizi[i]==value){

                if(i==0){
                    System.out.println("Girilen sayidan daha kucuk sayi yok."+"\nGirilen sayidan bbuyuk en kucuk sayi: "+dizi[i+1]);
                }
                else if(i== (dizi.length-1)){
                    System.out.println("Girilen sayidan daha buyuk sayi yok."+"\nGirilen sayidan kucuk en buyuk sayi: "+ dizi[i-1]);
                }
                else{
                    System.out.println("Girilen sayıdan kucuk en buyuk karakter: "+dizi[i+1]+"\nGirilen sayıdan buyuk en kucuk karakter "+dizi[i-1]);
                }
            }
        }
    }
}
