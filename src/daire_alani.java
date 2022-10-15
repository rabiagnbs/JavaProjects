import java.util.Scanner;
public class daire_alani {
    public static void main(String[] args) {
        int r,a;
        Double pi=3.14,Formul;
        Scanner input=new Scanner(System.in);
        System.out.print("lutfen daire diliminin yaricapini giriniz:");
        r=input.nextInt();
        System.out.println("lutfen daire diliminin merkez acisini giriniz.");
        a=input.nextInt();
        Formul=(pi*(r*r)*a)/360;
        System.out.println("daire diliminin alani:"+Formul);
    }
}
