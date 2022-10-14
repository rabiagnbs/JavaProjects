import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner input=new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz.");
        b=input.nextDouble();
        if(b>=0 && b<=1000){
            a=0.18;
        }
        else{
            a=0.08;
        }
        c=a*b;
        d=c+b;
        System.out.println("Sayının kdv tutarı:"+c);
        System.out.println("Sayının kdvli hali:"+d);

    }
}
