import java.util.Scanner;
import java.util.Arrays;

public class fibonacciSerisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fibonacci dizisinin kaç elemanlı olduğunu belirleyiniz:");
        int n=input.nextInt();
        int[] sayac=new int[n];
        sayac[0]=0;
        sayac[1]=1;
        for(int i=2; i<n; i++){
            sayac[i]=sayac[i-2]+sayac[i-1];
        }
        System.out.println(Arrays.toString(sayac));
    }
}
