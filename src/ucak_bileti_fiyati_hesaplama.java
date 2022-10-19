import java.util.Scanner;

public class ucak_bileti_fiyati_hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age, distance,trip_type;
        double price=0,age_sale=0,distance_sale=0,newPrice=0,trip_sale=0;
        System.out.println("welcome to air ticket calculator!");
        System.out.print("please write your age");
        age=input.nextInt();
        System.out.print("Please write your trip's distance");
        distance=input.nextInt();
        System.out.print("please write your trip type:if one direction/1, else if two direction/2");
        trip_type=input.nextInt();
        if(age>0 && distance>0 && (trip_type==1 || trip_type==2)){
            System.out.println("your data is correct!");
            price=distance*0.10;
            if(trip_type==2){
                ;
                System.out.print("our additional %20 discount if you choose two ways:");
            }
            if(0<age && age<12 ){
                age_sale=(price*50)/100;
                newPrice=price-age_sale;
                System.out.print("Our %50 discount price for those under 12 years old");
                if(trip_type==2){
                    trip_sale=(newPrice*20)/100;
                    distance_sale=newPrice-trip_sale;
                    System.out.println("both age sale and trip sale,total price:"+ distance_sale*2 );
                }
                else{
                    newPrice=price-age_sale;
                    System.out.println("both age sale and trip sale,total price:"+ newPrice );
                }
            }
            else if(12<age && age<24){
                age_sale=(price*10)/100;
                newPrice=price-age_sale;
                System.out.println("Our %10 discount price for those between 12-24 years old");
                if(trip_type==2){
                    trip_sale=(newPrice*20)/100;
                    distance_sale=newPrice-trip_sale;
                    System.out.println("both age sale and trip sale,total price:"+ distance_sale*2 );
                }
                else{
                    newPrice=price-age_sale;
                    System.out.println("both age sale and trip sale,total price:"+ newPrice );
                }
            }
            else if(age>65){
                age_sale=(price*30)/100;
                newPrice=price-age_sale;
                System.out.print("Our %30 discount price for those above 65 years old");
                if(trip_type==2){
                    trip_sale=(newPrice*20)/100;
                    distance_sale=newPrice-trip_sale;
                    System.out.println("both age sale and trip sale,total price:"+ distance_sale*2 );
                }
                else{
                    newPrice=price-age_sale;
                    System.out.println("both age sale and trip sale,total price:"+ newPrice );
                }
            }
            else{
                if(trip_type==2){
                    trip_sale=(price*20)/100;
                    distance_sale=price-trip_sale;
                    System.out.println("trip sale,total price:"+ distance_sale*2 );
                }
                else{
                    System.out.println("Total price:"+price);
                }
            }
        }
        else{
            System.out.println("your data is wrong! please write correct data!");
        }
    }
}
