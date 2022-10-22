import java.util.Scanner;

public class dort_ve_besin_kuvvetlerini_yazdirma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.print("lutfen bir sayi giriniz:");
        sayi=input.nextInt();
        int i=1,j=1;
        System.out.println("4un katlari:");
        while(i<sayi){
            System.out.println(i);
            i*=4;
        }
        System.out.println("5in katlari:");
        while(j<sayi){
            System.out.println(j);
            j*=5;
        }
    }

}
