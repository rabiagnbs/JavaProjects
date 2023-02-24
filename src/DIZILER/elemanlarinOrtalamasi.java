package DIZILER;

public class elemanlarinOrtalamasi {
    public static void main(String[] args) {
        int[] dizi=new int[]{12,31,34,56};

        double sum=0.0;
        double avarage;
        for(int i=0; i<dizi.length; i++){
            sum+=dizi[i];
        }
        avarage=sum / (dizi.length);
        System.out.println("dizideki elemanların ortalaması: "+ avarage);
    }
}
