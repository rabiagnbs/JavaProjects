import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2;
        System.out.print("ilk sayiyi giriniz:");
        n1=input.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        n2=input.nextInt();
        int choose;
        System.out.print("işlem seciniz; 1-)Toplama/ 2-)Cİkarma/ 3-)Carpma/ 4-)Bolme");
        choose=input.nextInt();
        switch (choose){
            case 1:
                System.out.println("iki sayinin toplami:"+(n1+n2));
                break;
            case 2:
                if(n1 > n2){
                    System.out.println("İki sayinin farki:"+(n1-n2));
                }
                else if(n2 >= n1){
                    System.out.println("İki sayinin farki:"+(n2-n1));
                }
                break;
            case 3:
                System.out.println("iki sayinin carpimi:"+(n1*n2));
                break;
            case 4:
                if(n1 > n2){
                    System.out.println("iki sayinin bolumu:"+(n1/n2));
                }
                else if(n2 >= n1){
                    System.out.println("iki sayinin bolumu:"+(n2/n1));
                }
                break;
            default:
                System.out.println("boyle bir islem yok");
        }
    }
}
