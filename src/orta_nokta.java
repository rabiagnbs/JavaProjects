import java.util.Scanner;

public class orta_nokta {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int left=100, right=200, password;
        boolean isPasswordSuccess=false;
        while(++left < --right);
        System.out.println(left);
        while(!isPasswordSuccess){
            System.out.println("şifreyi giriniz:");
            password =input.nextInt();
            if(password==123){
                System.out.println("Şifre doğru.");
                isPasswordSuccess=true;
            }
            else{
                System.out.println("Şifre yanlış. Tekrar deneyiniz.");
            }
        }
    }
}
