import java.util.*;
class Methods{
    public static void min_max(int num1, int num2, int num3){
        int max=Math.max(num1,num2);
        max = Math.max(max,num3);
        int min = Math.min(num1, num2);
        min = Math.min(min, num3);
        // System.out.println("I am here");
        System.out.println("Max: "+ max );
        System.out.println("Min: "+ min);
    }
    public static int Factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        int p = 1;
        for(int i=1;i<=num;i++){
            p = p*i;
        }
        return p;

    }
    public static void main(String args[]){
        Scanner input_obj= new Scanner(System.in);
        System.out.println(" Enter numbers  ");
        // int num1 = input_obj.nextInt();
        // int num2 = input_obj.nextInt();
        // int num3 = input_obj.nextInt();
        // min_max(num1,num2,num3);
        int num1 = input_obj.nextInt();
        int f = Factorial(num1);
        System.out.println("Factorial of "+ num1 + " is "+ f);
        System.out.println("Here");
    }
}