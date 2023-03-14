import java.util.Scanner;

public class tersYildiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayı Giriniz:");
        n = input.nextInt();

        for(int i=n; i>=1; i--){
            for (int k=n-i; k>=1; k--){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
