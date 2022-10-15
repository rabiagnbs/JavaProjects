import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Double Armut,Elma,Domates,Muz,Patlican,Toplam;
        int a,e,d,m,p;
        Armut=2.19;
        Elma=3.67;
        Domates=1.11;
        Muz=0.95;
        Patlican=5.00;
        System.out.println("Armut kac kilo?");
        a=input.nextInt();
        System.out.println("Elma kac kilo?");
        e=input.nextInt();
        System.out.println("Domates kac kilo?");
        d=input.nextInt();
        System.out.println("Muz kac kilo?");
        m=input.nextInt();
        System.out.println("Patlican kac kilo?");
        p=input.nextInt();
        Toplam=(Armut*a)+(Elma*e)+(Domates*d)+(Muz*m)+(Patlican*p);
        System.out.println("Toplam Hesap:"+Toplam);
    }
}
