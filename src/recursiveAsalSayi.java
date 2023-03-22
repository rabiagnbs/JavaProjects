import java.util.Scanner;

public class recursiveAsalSayi {
    public static boolean AsalSayi(int n,int a){

         if(a<=1){
             return true;
         }

         if(n%a==0){
             return false;
         }

         return AsalSayi(n,a-1);
    }
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Lütfen bir sayi giriniz:");
         int sayi=input.nextInt();
         int n=sayi/2;
         if(AsalSayi(sayi,n)){
             System.out.println("Bu sayi asaldır.");
         }
         else{
             System.out.println("Bu sayi asal degildir.");
         }
    }
}
