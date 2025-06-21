import java.util.*;
class Array_function{
    public static int[] remove(int[] temp, int val){
        boolean is_present = false;
        int index = -1;
        int[] new_temp = new int[temp.length-1];
        for(int i = 0 ; i < temp.length ; i++){
            if(temp[i]==val){
                is_present=true;
                index = i;
            }
        }
        if(is_present==true && index!=-1){
            for(int i = index ; i < temp.length-1 ; i++){
                int temp_val = temp[i];
                temp[i]=temp[i+1];
                temp[i+1]=temp_val;
            }
            temp[temp.length-1]=0;
            
            
            for(int i = 0 ; i < new_temp.length ; i++){
                new_temp[i]=temp[i];
            }
            System.out.println(Arrays.toString(new_temp));
        }
        else{
            System.out.println("element not found ");
        }
        return new_temp;
        
    }
    
    public static void main(String[] args){
        int[] arr = new int[100];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]=i*i;
        }
        System.out.println(Arrays.toString(arr));
        remove(arr,441);
    }
}