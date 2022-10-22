import java.util.Scanner;

public class bolunen_sayilarin_ortalamasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi=0;
        int toplam=0, sayac=0;
        double ortalama;
        System.out.print("Bir sayi giriniz:");
        sayi=input.nextInt();
        for(int i=0; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                toplam+=i;
                sayac++;
            }
        }
        ortalama=toplam/(sayac-1);
        System.out.println("3e ve 4e bolunen sayilarin ortalamasi:"+ ortalama);
        input.close();
    }
}
