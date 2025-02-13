import java.sql.SQLOutput;
import java.util.*;
public class ASS05 {
    public static int calculateSum (int[] arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = input.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int total_sum= calculateSum(arr);
        System.out.println("Rotal sum is : "+total_sum);
    }
}
