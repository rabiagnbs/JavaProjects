import java.util.Scanner;


public class RecursiveFibonacci {
    public static int Fibonacci(int a, int b, int sayi){
        if(sayi==0){
            return a;
        }
        System.out.print(a + " ");
        return  Fibonacci(b,a+b,sayi-1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fibonacci dizisinin basamak sayisini giriniz:");
        int sayi=input.nextInt();
        int a=0, b=1;
        System.out.println(sayi+" elemanlı Fibonacci Dizisi: ");
        Fibonacci(a,b,sayi);
    }
}
