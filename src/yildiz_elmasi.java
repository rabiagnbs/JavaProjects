import java.util.Scanner;

public class yildiz_elmasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Bir sayi giriniz:");
        n=input.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int m=n;m>0;m--){
            for (int l = 0; l <= (n - m); l++) {
                System.out.print(" ");
            }
            for (int p=(2*m-1); p>=1; p--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        }

    }

