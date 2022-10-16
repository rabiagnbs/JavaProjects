import java.util.Scanner;


public class kosul_ifadeleri {
    public static void main(String[] args) {
        int a=10, b=20;
        boolean compare=(a==b);
        String str=compare ? "esittir.":"esit degildir";
        System.out.println(str);
        if(compare){
            System.out.println("esittir.");
        }
        else{
            System.out.println("esit degildir.");
        }

        int day=1;
        switch(day){
            case 1:
                System.out.println("Bugün pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Gün bitti.");
                break;
        }
    }
}
