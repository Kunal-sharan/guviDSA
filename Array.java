import java.util.*;

class ShiftArray{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5,};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int new_val = 150;
        int index = 2;
        for(int i: arr){
            temp.add(i);
        }
        // index+=1;
        temp.add(0);

        for(int i = temp.size()-1 ; i > index ; i--){
            temp.set(i, temp.get(i-1));
        }
        temp.set(index,new_val);
        System.out.println(temp);
            }
}