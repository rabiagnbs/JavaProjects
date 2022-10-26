import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,us,sonuc=1;
        System.out.println("Üssünü hesaplanması istediginiz sayiyi giriniz:");
        sayi=input.nextInt();
        System.out.println("Kac üssü olsun?");
        us=input.nextInt();
        for(int i=1; i<=us; i++){
            sonuc*=sayi;
        }
        System.out.println("sayinin üslü sonucu:"+sonuc);
    }
}
