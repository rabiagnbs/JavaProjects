import java.util.Scanner;


public class ATMuygulamasi {
    public static void main(String[] args){
        String userName, passWord;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adı ve şifrenizi giriniz.");
        userName=input.nextLine();
        passWord=input.nextLine();
        int sayac=3;
        int secenek;
        int wage=1500;
        int ParaYatirma;
        int ParaCekme;
        int cikis=0;
        while(sayac>0 || cikis!=-1){
            if(userName.equals("rabiagnbs") && passWord.equals("123")){
                System.out.println("Tebrikler sisteme başarılı bir şekilde giriş yaptınız.");
                do{
                    System.out.println("Lutfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println(" 1-)Para Yatırma \n 2-)Para Çekme \n 3-)Bakiye Sorgulama \n 4-)Çıkış Yap");
                    secenek=input.nextInt();
                    switch(secenek){
                        case 1:
                            System.out.println("Yatırmak istediğiniz para miktarını yazınız:");
                            ParaYatirma=input.nextInt();
                            System.out.println("Toplam "+ParaYatirma+"miktarında para yatırdınız.");
                            wage+=ParaYatirma;
                            System.out.println("Maaşınızın güncellenmiş hali:"+wage);
                            break;
                        case 2:
                            System.out.println("Çekmek istediginiz para miktarını giriniz:");
                            ParaCekme=input.nextInt();
                            System.out.println("Toplam "+ParaCekme+" miktarında para cektiniz.");
                            wage-=ParaCekme;
                            System.out.println("Maaşınızın güncellenmiş hali:"+wage);
                            break;
                        case 3:
                            System.out.println("Hesabınızdaki bakiyenin son durumu:"+wage);
                            break;
                        case 4:
                            System.out.println("Çıkış Yapılıyor...");
                            sayac=0;
                            cikis=-1;
                            break;
                        default:
                            System.out.println("Yanlış bir seçim yaptınız. Lütfen tekrar deneyiniz.");
                            break;
                    }
                }while(cikis!=-1);

                sayac=0;
            }
            else{
                System.out.println("Kullanıcı adı veya şifre hatalı, lütfen tekrardan deneyiniz. Kalan hakkınız:"+(--sayac));
                if(sayac==0){
                    System.out.println("Deneme hakkınız bittiği için hesabınız bloke olmuştur.");
                   break;
                }
                else{
                    userName=input.nextLine();
                    passWord=input.nextLine();
                }
            }
        }


    }
}
