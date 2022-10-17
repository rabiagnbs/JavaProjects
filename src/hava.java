import java.util.Scanner;

public class hava {
    public static void main(String[] args) {
        float hear;
        Scanner input=new Scanner (System.in);
        System.out.print("hava sicakligini giriniz.");
        hear=input.nextFloat();
        if(hear<5){
            System.out.println("Ailenizle müthiş bir dağda kayak yapabilir ve saleplerinizi yudumlayabilirisniz..");
        }
        else if(hear>=5 && hear<15){
            System.out.println("Arkadaşlarınızla sinemaya gitmek için çok güzel bir gün!");
        }
        else if(hear>=15 && hear<25){
            System.out.println("Mangalda piknik zamanııı...");
        }
        else{
            System.out.println("sahili mültecilere kaptırmayalım yüzmeye ne dersin?");
        }
    }
}
