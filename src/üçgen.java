import java.util.Scanner;
public class üçgen {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("lutfen ucgenin uc kenarini yaziniz.");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        int u;
        Double Alan;
        u=(a+b+c)/2;
        Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("ucgenin alani:"+Alan);

   }
}
