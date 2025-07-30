//Conditional Statements
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String args[]) {
        Scanner value=new Scanner(System.in);
        int a = 6;
        System.out.println("IF STATEMENT");
        if (a > 5) {
            System.out.println("The number greater than 5");
        }
        System.out.println("IF ELSE STATEMENT");
        if(a>10){
            System.out.println("The number is greater than 10");
        }else{
            System.out.println("The number is less than 10");
        }
        System.out.println("ELSE IF LADDER");
        int marks=86;
        if(marks>=90){
            System.out.println("A grade");
        }else if(marks>=80){
            System.out.println("B grade");
        }else if(marks>=70){
            System.out.println("C grade");
        }else if(marks>=60){
            System.out.println("D grade");
        }else{
            System.out.println("Fail");
        }
        System.out.println("SWITCH CASE STATEMENT");
        System.out.println("Enter a number to find the day(1 to 7):");
        int week=value.nextInt();
        switch(week)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
        }
        System.out.println("FOR LOOP");
        for(int i=0;i<10;i++){
            System.out.println("Val:"+i);
        }
        int k=6;
        System.out.println("WHILE LOOP");
        while(k<16){
            System.out.println("The values are:"+k);
            k++;
        }
        System.out.println("FOREACH LOOP");
        int nums[]={1,3,5,7,11};
        for(int n:nums){
            System.out.println(n);
        }
        System.out.println("NESTED IF");
        System.out.println("Enter the value: ");
        int num=value.nextInt();
        if(num<50){
            System.out.println("Number less than 50");
            if(num%5==0){
                System.out.println("Number is divisible by 5");
            }
        }
        System.out.println("DO WHILE");
        System.out.println("Enter a value: ");
        int z=value.nextInt();
        do{
        	System.out.println(z);
        	z++;	
        }while(z<10);
    }
}


