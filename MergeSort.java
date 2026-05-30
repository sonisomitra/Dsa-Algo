import java.util.Arrays;
import java.util.Scanner;

public class MergeSort{
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
        mergeSort(n,0,n.length-1);
        System.out.println("Sorted Array = "+ Arrays.toString(n));
            sc.close();
    }
public static void mergeSort(int n[],int l,int r){
 
    if(l<r){
        int mid =(l+r)/2;
        mergeSort(n , l , mid);
        mergeSort(n , mid+1 , r);
        merge(n, l , mid ,r);
    }
}
private static void merge(int n[] , int l , int mid , int r){
int l1 = mid-l+1;
int r1 = r - mid;
int ln[] = new int[l1];
int rn[] = new int[r1];
//copy values

for (int x=0;x<l1;x++){
     ln[x] = n[l+x];
    }
for (int x=0;x<r1;x++){
     rn[x] = n[mid+1+x];
    }
    int i = 0;
    int j = 0;
    int k = l;   

        while (i<l1 && j<r1){
            if(ln[i] <= rn[j]){
                n[k] = ln[i];
                i++;
            }
            else {
                n[k] = rn[j];
                j++;
            }
            k++;
        }
        while (i<l1){
            n[k] = ln[i];
            i++;
            k++;
        }
        while (i<l1){
            n[k] = rn[j];
            j++;
            k++;
}
}
} 
