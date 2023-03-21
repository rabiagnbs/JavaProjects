import java.util.Scanner;

public class gelismisHesapMakinesi {

      public static void plus(int a,int b){
          System.out.println("Bu sayıların toplamı: "+(a+b));
      }

      public static void extraction(int a,int b){
          if(a>b){
              System.out.println("Bu sayıların farkı: "+(a-b));
          }
          else{
              System.out.println("Bu sayıların farkı: "+(b-a));
          }
      }

      public static void multiplication(int a, int b){
          System.out.println("Bu sayıların çarpımı: "+(a*b));
      }

      public static void division(int a, int b){
          if(a>b){
              System.out.println("Bu sayıların bölümü: "+(a/b));
          }
          else{
              System.out.println("Bu sayıların bölümü: "+(b/a));
          }
      }
      public static int exponentialNumber(int a, int b){
          if(b==1){
              return a;
          }
          return a * exponentialNumber(a,b-1);
      }
      public static int factoriel(int a){
          if(a==0 || a==1){
              return 1;
          }
          return a* factoriel(a-1);
      }

      public static void modding(int a,int b){
          int temp=a%b;
          System.out.println(a+" sayısının"+" "+b+" sayisina göre modu: "+temp);
      }

      public static void rectangle(int a, int b){
          int alan;
          alan=a*b;
          int cevre;
          cevre=2*(a+b);
          System.out.println("Dikdörtgenin alanı: "+alan+" Dikdörtgenin çevresi: "+cevre);
      }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Yapmak istediginiz işlemi seçiniz: \n1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n\n" +
                "Seçeneğiniz: ");
        int secenek=input.nextInt();
        switch(secenek){
            case 1:
                System.out.println("Toplamak istediginiz sayilari giriniz:");
                int a=input.nextInt();
                int b=input.nextInt();
                plus(a,b);
                break;
            case 2:
                System.out.println("Çıkarma yapmak istediğiniz sayıları giriniz:");
                int c=input.nextInt();
                int d=input.nextInt();
                extraction(c,d);
                break;
            case 3:
                System.out.println("Çarpma yapmak istediğiniz sayıları giriniz:");
                int e=input.nextInt();
                int f=input.nextInt();
                multiplication(e,f);
                break;
            case 4:
                System.out.println("Bölme yapmak istediğiniz sayıları giriniz: ");
                int w=input.nextInt();
                int y=input.nextInt();
                division(w,y);
                break;
            case 5:
                System.out.println("üs alacağınız sayıyı ve derecesini giriniz.");
                System.out.println("sayi: ");
                int g=input.nextInt();
                System.out.println("derecesi: ");
                int h=input.nextInt();
                int sonuc=exponentialNumber(g,h);
                System.out.println("işlemlerin sonucu:"+sonuc);
                break;

            case 6:
                System.out.println("Faktoriyelini almak istediğiniz sayiyi giriniz: ");
                int i=input.nextInt();
                int sonuc2=factoriel(i);
                System.out.println("işlemlerin sonucu:"+sonuc2);
                break;

            case 7:
                System.out.println("modunu almak istediğiniz sayıyı ve mod sayısını giriniz: ");
                System.out.println("modunu almak istediginiz sayı: ");
                int k=input.nextInt();
                System.out.println("mod sayısı: ");
                int l=input.nextInt();
                modding(k,l);
                break;

            case 8:
                System.out.println("dikdörtgenin uzun ve kısa kenarını giriniz: ");
                System.out.println("uzun kenarı: ");
                int p=input.nextInt();
                System.out.println("kısa kenarı: ");
                int r=input.nextInt();
                rectangle(p,r);
                break;

        }

    }
}
