import java.util.Scanner;

public class sayinin_basamak_sayilarini_toplayan_program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,temp,total=0;
        System.out.println("Bir sayi giriniz.");
        sayi=input.nextInt();
        while(sayi!=0){
            temp=sayi%10;
            total+=temp;
            sayi=sayi/10;
        }
        System.out.print("girdiginiz sayinin rakamlari toplami:"+total);
    }
}
