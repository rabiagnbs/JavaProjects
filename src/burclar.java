import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ay;
        int gun;
        System.out.println("dogum ayınızı giriniz:");
        ay=input.nextLine();
        System.out.println("dogum gununuzu giriniz:");
        gun=input.nextInt();
        if(ay.equals("Ocak")){
            if(gun<22){
                System.out.println("Oğlak Burcusunuz.");
            }
            else if(gun>21 && gun<31){
                System.out.println("Kova Burcusunuz.");
            }
        }
        if(ay.equals("Subat")){
            if(gun<20){
                System.out.println("Kova Burcusunuz.");
            }
            else if(gun>19 && gun <29){
                System.out.println("Balık Burcusunuz.");
            }
        }
        if(ay.equals("Mart")){
            if(gun<21){
                System.out.println("Balık Burcusunuz.");
            }
            else if(gun>20 && gun<31){
                System.out.println("Koç Burcusunuz.");
            }
        }
        if(ay.equals("Nisan")){
            if(gun<21){
                System.out.println("Koç Burcusunuz.");
            }
            else if(gun>20 || gun<30){
                System.out.println("Boğa Burcusunuz.");
            }
        }
        if(ay.equals("Mayıs")){
            if(gun<22){
                System.out.println("Boğa Burcusunuz.");
            }
            else if(gun>21 || gun<31){
                System.out.println("İkizler Burcusunuz.");
            }
        }
        if(ay.equals("Haziran")){
            if(gun<23){
                System.out.println("İkizler Burcusunuz.");
            }
            else if(gun>22 || gun<31){
                System.out.println("Yengeç Burcusunuz.");
            }
        }
        if(ay.equals("Temmuz")){
            if(gun<23){
                System.out.println("Yengeç Burcusunuz.");
            }
            else if(gun>22 || gun<31){
                System.out.println("Aslan Burcusunuz.");
            }
        }
        if(ay.equals("Ağustos")){
            if(gun<23){
                System.out.println("Aslan Burcusunuz.");
            }
            else if(gun>22 || gun<31){
                System.out.println("Başak Burcusunuz.");
            }
        }
        if(ay.equals("Eylül")){
            if(gun<23){
                System.out.println("Başak Burcusunuz.");
            }
            else if(gun>22 || gun<31){
                System.out.println("Terazi Burcusunuz.");
            }
        }
        if(ay.equals("Ekim")){
            if(gun<23){
                System.out.println("Terazi Burcusunuz.");
            }
            else if(gun>22 || gun<31){
                System.out.println("Akrep Burcusunuz.");
            }
        }
        if(ay.equals("Kasım")){
            if(gun<22){
                System.out.println("Akrep Burcusunuz.");
            }
            else if(gun>21 || gun<31){
                System.out.println("Yay Burcusunuz.");
            }
        }
        if(ay.equals("Aralık")){
            if(gun<22){
                System.out.println("Yay Burcusunuz.");
            }
            else if(gun>21 || gun<31){
                System.out.println("Oğlak Burcusunuz.");
            }
        }

    }
}
