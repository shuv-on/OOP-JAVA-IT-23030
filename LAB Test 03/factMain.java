public class factMain {
    public void findFactorial(int number){
        int count=0;
        for(int i=1;i<=number;i++){
            int tmp=i;
            int sum=0;
            while(tmp>0){
                int fact=1;
                int digit=tmp%10;
                for(int j=1;j<=digit;j++){
                    fact*=j;
                }
                sum+=fact;
                tmp/=10;
            }
            if(sum==i){
                count++;
                System.out.println("Factorion number is : "+i);
            }
        }
        System.out.println("Total : "+count);
    }
}
