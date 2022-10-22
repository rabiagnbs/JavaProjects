import java.util.Scanner;

public class cift_ve_dordun_katlarini_toplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi, toplama=0;
        do{
            System.out.println("lutfen cift bir sayi giriniz.");
            sayi=input.nextInt();
            if(sayi%4==0 && sayi!=2 && sayi!=0){
                toplama+=sayi;
            }
        }while(sayi%2==0);

        System.out.println("4e tam bolunen sayilarin toplami:"+toplama);
    }
}
