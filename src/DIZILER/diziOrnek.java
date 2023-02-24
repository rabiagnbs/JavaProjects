package DIZILER;

public class diziOrnek {

    public static int[] reverse(int[] list){
        int[] reverse=new int[list.length];
        for(int i=0, j= list.length-1; i<list.length; i++, j--){
            reverse[i]=list[j];

        }
        return reverse;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5,6};
        int[] newList= reverse(dizi);
        printArray(newList);
    }
}
