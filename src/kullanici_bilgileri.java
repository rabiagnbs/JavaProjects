import java.util.Scanner;

public class kullanici_bilgileri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newpassword;
        String answer;
        System.out.print("kullanici adinizi giriniz:");
        userName = input.nextLine();
        System.out.print("şifrenizi giriniz:");
        password = input.nextLine();
        if (userName.equals("Patika") && password.equals("java123")) {
            System.out.print("bilgileriniz dogru.");
        } else if (! userName.equals("Patika")) {
            System.out.println("kullanici bulunamadi.");
        } else if (! password.equals("java123")) {
            System.out.println("sifre yanlis!");
            System.out.println("sifrenizi sifirlamak istiyor musunuz?/ evet ya da hayir yazin");
            answer = input.nextLine();
            if (answer.equals("evet")) {
                System.out.println("yeni sifrenizi giriniz:");
                newpassword = input.nextLine();
                if (newpassword.equals(password)) {
                    System.out.println("lutfen baska bir sifre giriniz.");
                    newpassword = input.nextLine();
                    System.out.println("sifre olusturuldu.");
                } else {
                    System.out.println("sifre olusturuldu.");
                }
        }

        }
        else{
            System.out.println("hatali bilgiler.");
        }
    }
}
