import java.util.*;
public class factorial{
    static void myfact(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter a number : ");
        int num=input.nextInt();

        int tmp=num;
        int sum=0;
        while(tmp>0){
            int fact=1;
            int dg=tmp%10;
            for(int i=1;i<=dg;i++){
                fact*=i;
            }
            sum+=fact;
            tmp/=10;
        }
        System.out.println("Factorial's number sum is : "+sum);
        if(num==sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static void main(String[] args){
        myfact();
    }

}

