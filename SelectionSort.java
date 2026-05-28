import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort{
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
        SelectSort(n);
        System.out.println("Sorted Array = "+ Arrays.toString(n));
            sc.close();
    } 
    public static void SelectSort(int n[]){
        int temp = 0;    
        int minIndex = -1;
        for (int i=0;i<n.length-1;i++){
            minIndex=i;    
            for (int j=i+1;j<n.length;j++){
                    if (n[minIndex]>n[j]){
                        minIndex=j; 
                }
            temp = n[minIndex];
            n[minIndex] = n[i];
            n[i] = temp;    
            }
        }
    }
}
