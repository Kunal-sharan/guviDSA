import java.util.*;
import java.io.*;
class OrderedArray{
    private long[] arr;
    Random rand = new Random();
        //   int max=100,min=50;
    public OrderedArray(int size){
        arr = new long[size];
    }
    public void set(int index , long value){
        arr[index] = value;
    }

    public void bin_srch(){
        int l = 0;
        int r = arr.length-1;
        int c = 0;
        // int guess=rand.nextInt((r-l + 1)) + l;
        int guess=rand.nextInt((r+1)-(l+1) + 1) + (l+1);
        int u = 0 ;
        while(l<=r){
            if(arr[l]==arr[r]){
                System.out.println("Number is "+ arr[l] + " You lost");
                break;
            }
            c++;
            
            int mid=(l+r)/2;
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int user_guess = scn.nextInt();
            if(user_guess==guess){
                System.out.println("U guessed it before computer ");

                break;
            }
            else{
                System.out.println("Computer guess "+ arr[mid]);
                
            }
            // System.out.println(guess);
            if(arr[mid]==guess){
                System.out.println(c);
                System.out.println("computer guessed before you the number is "+guess);
                // return true;
                break;
            }
            if(arr[mid]>guess){
                r=mid-1;
                System.out.println("Number is between "+ arr[l] + " and " + arr[r] + " including both");
            }
            else{
                l=mid+1;
                System.out.println("Number is between "+ arr[l] + " and " + arr[r] + " including both");
            }
        }
    }
    public void show(){
        System.out.println(Arrays.toString(arr));
    }
}
class Gussing_the_number{
    public static void main(String[] args){
        OrderedArray arr = new OrderedArray(25);
        for(int i = 0 ; i < 25 ; i++){
            arr.set(i,i+1);
        }
        arr.show();
        arr.bin_srch();
        // while(true){
        //     Scanner scn = new Scanner(System.in);
        //     System.out.print("Enter a string: ");
        //     String str = scn.nextLine();
        //     if(str.equals("quit")){
        //         System.out.println("Quit");
        //         break;
        //     }
        //     System.out.println("You entered: " + str);
           
        // }
    }
}