import java.util.Scanner;

public class not_ortalamasi_java {
    public static void main(String[] args) {
        float a,b,c,d;
        float toplama,ortalama;
        System.out.print("Fizik Notunuzu Giriniz.");
        Scanner input=new Scanner(System.in);
        a=input.nextFloat();

        System.out.println("Matematik Notunuzu Giriniz.");
        b=input.nextFloat();

        System.out.println("Kimya Notunuzu Giriniz");
        c=input.nextFloat();

        System.out.println("Fizik Notunuzu Giriniz.");
        d=input.nextFloat();

        toplama=a+b+c+d;
        ortalama=toplama/4;
        System.out.println("Notlarin ortlamasi:");
        System.out.print(ortalama);
        boolean kosul = ortalama >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);


    }
}
