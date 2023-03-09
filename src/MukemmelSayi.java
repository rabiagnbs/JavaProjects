import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi;
        System.out.println("lutfen bir sayi giriniz.");
        Scanner input=new Scanner(System.in);
        sayi=input.nextInt();
        int sayac=0;
        for(int i=1; i<sayi; i++){
            if(sayi%i==0){
                sayac+=i;
            }
        }
        if(sayac==sayi){
            System.out.println(sayi+" Sayisi Mükemmel Sayidir.");
        }
        else{
            System.out.println(sayi+" Sayisi Mükemmel Sayi Degildir.");
        }
    }
}
