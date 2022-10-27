import java.util.Scanner;

public class harmonil_sayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        double result=0.0;
        System.out.println("bir sayi giriniz:");
        sayi=input.nextInt();
        for(int i=1; i<=sayi; i++){
            result +=(1.0/i);
        }
        System.out.print("girdiginiz sayinin harmonik degeri:"+result);
    }
}
