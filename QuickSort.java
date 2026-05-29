import java.util.Arrays;
import java.util.Scanner;
public class QuickSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int n[] = new int[size];
        System.out.println("Enter values of Array");
        for (int i=0;i<size;i++){
            n[i] = sc.nextInt();
            }
        System.out.println("Unsorted Array = "+ Arrays.toString(n));
        QkSort(n,0,n.length-1);
        System.out.println("Sorted Array = "+ Arrays.toString(n));
            sc.close();
    } 
public static void QkSort(int n[], int low , int high){ 
    
    if (low < high){
        int pi = partition(n , low ,high);
        QkSort(n,low,pi-1);
        QkSort(n,pi+1,high);

    }
}
private static int partition(int n[] , int low , int high){
int pivot = n[high];
int i = low -1;

for(int j=low;j<high;j++){
    if (n[j]<pivot){ 
        i++;
        int temp = n[i];
        n[i]=n[j];
        n[j] = temp;
    }
}
        int temp = n[i+1];
        n[i+1]=n[high];
        n[high] = temp;

        return i+1;
}
}
