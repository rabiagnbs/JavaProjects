package DIZILER;

public class elemanlarinHarmonikOrtalamasi {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5,6};

        double sum=0.0;
        double harmonik=0.0;
        for(int i=0; i<dizi.length; i++){
           sum+=1.0/dizi[i];
        }

        harmonik=dizi.length / sum;
        System.out.println("Dizinin harmonik hesaplaması: "+harmonik);
    }
}
