import java.util.Scanner;
public class vucut_kutle_indeksi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Double boy,kilo,vki;
        System.out.print("lutfen boyunuzu(metre cinsinden) giriniz:");
        boy=input.nextDouble();
        System.out.println("lutfen kilonuzu giriniz:");
        kilo=input.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("vücut kütke indeksiniz:"+vki);
    }
}
