import java.util.Scanner;


public class PalindromKontrol {
    public static boolean PalindromYazi(String yazi){
        int i=0;
        int j=yazi.length()-1;
        while(i!=j){
            if(yazi.charAt(i)!=yazi.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("lutfen bir yazi giriniz.");
        Scanner input=new Scanner(System.in);
        String yazi=input.nextLine();
        boolean result;
        result=PalindromYazi(yazi);
        if(result){
            System.out.println("Yazdığınız yazı palindrom sayidir.");

        }
        else{
            System.out.println("Yazı palindrom sayi değildir!");
        }
    }
}
