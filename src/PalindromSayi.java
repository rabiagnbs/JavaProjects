import java.util.Scanner;


public class PalindromSayi {
    public static boolean isPalindrom(int sayi){
        int temp=sayi;
        int lastNumber, reverseNumber=0;
        while(temp !=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp=temp/10;
        }
        if(reverseNumber==sayi){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        int sayi=input.nextInt();
        boolean note=isPalindrom(sayi);
        if(note){
           System.out.println("Girdiğiniz sayi palindrom sayidir.");
        }
        else{
            System.out.println("Girdiğiniz sayi palindrom değildir.");
        }
    }
}
