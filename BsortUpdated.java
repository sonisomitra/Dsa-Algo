import java.util.Arrays;
import java.util.Scanner;
public class BSort{
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
        BubbleSort(n);
        System.out.println("Sorted Array = "+ Arrays.toString(n));
            sc.close();
    } 
    public static void BubbleSort(int n[]){
        int temp = 0;    
        for (int i=0;i<n.length-i-1;i++){
                for (int j=0;j<n.length-i-1;j++){
                    if (n[j]>n[j+1]){
                        temp = n[j];
                        n[j] = n[j+1];
                        n[j+1]= temp; 
                }
            }
        }
    }
}
