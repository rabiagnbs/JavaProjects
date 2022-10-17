import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("uc sayi giriniz.");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("sayilarin kucukten buyuge siralanisi" + c+"<" + b+"<" + a);
                } else {
                    System.out.println("sayilarin kucukten buyuge siralanisi" + b+"<" + c+"<" + a);
                }
            } else {
                System.out.println("sayilarin kucukten buyuge siralanisi" + b+"<" + a+"<" + c);
            }
        } else {
            if (c > b) {
                System.out.println("sayilarin kucukten buyuge siralanisi" + a+"<" + b+"<" + c);
            } else {
                if (c > a) {
                    System.out.println("sayilarin kucukten buyuge siralanisi" + a+"<" + c+"<" + b);
                } else {
                    System.out.println("sayilarin kucukten buyuge siralanisi" + c+"<" + a+"<" + b);
                }
            }
        }
    }
}



