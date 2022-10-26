import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1, sayi2;
        int sayi11=1, sayi22=1, sayi33=1, kombinasyon=0;
        System.out.println("kombinasyonu hesaplanmasi istediginiz sayiyi ve kacli kombinasyonu olasi gerektigini giriniz.");
        sayi1=input.nextInt();
        sayi2=input.nextInt();
        for(int i=1; i<=sayi1; i++){
            sayi11*=i;
        }
        for(int j=1; j<=sayi2; j++){
            sayi22*=j;
        }
        for(int k=1; k<=(sayi1-sayi2); k++){
            sayi33*=k;
        }
        kombinasyon=sayi11/(sayi22*sayi33);
        System.out.println("Kombinasyon:"+kombinasyon);
    }
}
