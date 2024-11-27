import java.util.*;
public class Quiz {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please, Enter your name : ");
        String str=input.nextLine();
        System.out.println("Welcome "+ str);
        System.out.println("Do you want to play?\n1) Yes\n2) No");
        int con=input.nextInt();
        int solved=0,wrong=0,result=0;
        System.out.println("Please, enter \na=1\nb=2\nc=3\nd=4");
        switch (con){
            case 1: {
                //qn---> 01
                System.out.println("What is the capital of South Africa ? \na) Zurich\nb) Bern\nc) Cape Town\nd) Paris");
                int ans1=input.nextInt();
                if (ans1 == 3) {
                    System.out.println("Correct!");
                    result+=2;
                    solved++;
                }else {
                    System.out.println("incorrect! correct ans is c");
                    wrong--;
                }//qn 01 end
                //qn---> 02
                System.out.println("What is the capital of Switzerland ? \na) Zurich\nb) Bern\nc) New York\nd) Paris");
                int ans2=input.nextInt();
                if (ans2 == 1) {
                    System.out.println("Correct!");
                    result+=2;
                    solved++;
                }else {
                    System.out.println("incorrect! correct ans is a");
                    wrong--;
                }//qn 02 end
                //qn---> 03
                System.out.println("What is the national flower of Bangladesh? ? \na) Water lily\nb) Rose\nc) Tulip\nd) Daffodil");
                int ans3=input.nextInt();
                if (ans3 == 1) {
                    System.out.println("Correct!");
                    result+=2;
                    solved++;
                }else {
                    System.out.println("incorrect! correct ans is a");
                    wrong--;
                }//qn 03 end
                //qn---> 04
                System.out.println("On which continent is Bangladesh located ? \na) Africa\nb) Asia\nc) Australia\nd) Europe");
                int ans4=input.nextInt();
                if (ans4 == 2) {
                    System.out.println("Correct!");
                    result+=2;
                    solved++;
                }else {
                    System.out.println("incorrect! correct ans is b");
                    wrong--;
                }//qn 04 end
                //qn---> 05
                System.out.println("What is the Time Zone of Bangladesh ? \na) UTC +5.00\nb) UTC +4.00\nc) UTC +7.00\nd) UTC +6.00");
                int ans5=input.nextInt();
                if (ans5 == 4) {
                    System.out.println("Correct!");
                    result+=2;
                    solved++;
                }else {
                    System.out.println("incorrect! correct ans is d");
                    wrong--;
                }//qn 05 end


                break;
            }
            case 2: {
                break;
            }
        }
        System.out.println("Name : "+str+", Solved : "+solved+", Wrong : "+wrong+", Result : "+result);


    }
}
