import java.util.Scanner;

public class EbobEkok {
    public static void Ebob(int sayi1, int sayi2){
        int bs,ks,ebob=0;
        if(sayi1>sayi2){
            bs=sayi1;
            ks=sayi2;
        }
        else{
            bs=sayi2;
            ks=sayi1;
        }
        for(int i=1; i<=ks; i++){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println("Bu sayilarin ebobu: "+ebob);
    }

    public static void Ekok(int sayi1,int sayi2){
        int bs,ks,ekok=0;
        if(sayi1>sayi2){
            bs=sayi1;
            ks=sayi2;
        }
        else{
            bs=sayi2;
            ks=sayi1;
        }
       int i=bs;
        while(ekok==0){
            if(i%ks==0 && i%bs==0){
                ekok=i;
            }
            i++;
        }
        System.out.println("Bu sayilarin ekoku: "+ekok);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("İki adet sayi giriniz: ");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        Ekok(sayi1,sayi2);
        Ebob(sayi1,sayi2);
    }

}
