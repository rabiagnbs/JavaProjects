public class asalSayiBulma {
    public static void main(String[] args) {
        System.out.print("0'dan 100'e kadar olan asal sayilar:");

        for( int sayi=2; sayi<100; sayi++){
            int n=0;
            for(int i=1; i<=sayi; i++){
                if(sayi % i==0){
                    n++;
                }
            }
            if(n<=2){
                System.out.print("\t"+sayi);
            }
        }

    }
}
