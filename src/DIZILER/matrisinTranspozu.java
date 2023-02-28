package DIZILER;
import java.util.Arrays;
import java.util.Scanner;

public class matrisinTranspozu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("matrisin satır sayısını giriniz.");
        int a=input.nextInt();
        System.out.println("matrisin sutun sayisini giriniz.");
        int b=input.nextInt();

        int[][] arr=new int[a][b];

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.println("matrisin"+i+".satırının"+j+". sutunun elemanını giriniz.");
                int c=input.nextInt();
                arr[i][j]=c;
            }
        }


         System.out.println("matris: ");
        for(int i=0; i< a; i++){
            for(int j=0; j<b; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("matrisin traspozu:");
        for(int j=0; j<b; j++){
            for(int i=0; i<a; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
