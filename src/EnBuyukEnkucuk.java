import java.util.Arrays;
import java.util.Scanner;


public class EnBuyukEnkucuk {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        System.out.println("Girmek istediginiz sayi miktarini giriniz.");
        n=input.nextInt();
        int[] arr=new int[n];
        int enBuyuk=arr[0];
        int enKucuk=arr[0];


        System.out.println("Sayilari sırayla "+n+" kadar giriniz.");
        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
            }
            if (arr[i] < enKucuk) {
                enKucuk = arr[i];
            }
        }
        Arrays.sort(arr);
        System.out.println("En küçük değer:"+arr[0]+"\nEn büyük değer:"+arr[n-1]+"\nDizinin sıralanmış hali:"+Arrays.toString(arr));

    }
}
