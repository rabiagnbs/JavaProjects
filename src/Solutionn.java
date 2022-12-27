import java.util.Scanner;
class MyCalculator {
    public int power(int n, int p) throws Exception
    {
        if(n<0 || p<0)
            throw new Exception("n or p should not be negative.");
        else if(n==0 && p==0)
            throw new Exception("n and p should not be zero.");
        else{
            double result = Math.pow(n, p);
            return (int)result;
        }
    }
}
public class Solutionn {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
//Javadaki bazı Hatalar
//ArithmeticException: Sıfıra bölme başta olmak üzere matematiksel hataları belirtir.
//
//
//ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
//
//
//ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
//
//
//IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
//
//
//IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
//
//
//NullPointerException: Henüz değer ataması yapılmamış değişkenler üzerinde işlem yapmaya çalışıldığında fırlatılır. Java’da en çok karşılaşılan hatalardan biridir. Bu hataya karşı önlem almak için yaptığımız kontrollere null kontrolü (null-check) denir.
//
//
//NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
//
//
//UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.