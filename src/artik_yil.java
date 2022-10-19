import java.util.Scanner;

public class artik_yil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int artikYil;
        System.out.print("Yili giriniz:");
        artikYil=input.nextInt();
        if(artikYil%4==0){
            if(artikYil%100==0){
                if(artikYil%400==0){
                    System.out.println(artikYil + " artik yildir.");
                }
                else{
                    System.out.println(artikYil + " artik yil degildir.");
                }
            }
            else{
                System.out.println(artikYil + " artik yildir.");
            }
        }
        else{
            System.out.println(artikYil + " artik yil degildir.");
        }
    }
}
