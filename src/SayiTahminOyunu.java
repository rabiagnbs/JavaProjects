
import java.util.Random;
import java.util.Scanner;




public class SayiTahminOyunu {

    public static boolean TuttuMu(int sayi, int number){
        return sayi==number;
    }


    public static void main(String[] args) {
           Random rand=new Random();
           int number=rand.nextInt(10);


           System.out.println("lütfen bir sayi giriniz.");
           Scanner input=new Scanner(System.in);


           int sonuc=0;
           boolean result;

           while(sonuc != -1){

               int sayi=input.nextInt();
               input.nextLine();
               result =TuttuMu(sayi,number);

               if( result){
                   System.out.println("Sayiyi dogru tahmin ettiniz. Tebrikler!");
               }
               else {
                   System.out.println("Sayiyi dogru tahmin edemediniz. Lütfen tekrar deneyiniz :(");
               }
               System.out.println("Tahmin oyunundan cikmak icin lutfen -1'e basiniz.");
               sonuc=input.nextInt();


           }
           System.out.println("Oyundan cikiliyor...");
    }
}
