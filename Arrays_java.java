import java.util.Arrays;
class LowArray{
    private long[] a;

    public LowArray(int s){ // constructor
        a = new long[s];
    }
    public void set(int index , long value){
        a[index]=value;
    }
    public long get_by_index(int index){
        return a[index];
    }
    public int get_by_value(long value){
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]==value){
                return i;
            }
        }
        return -1;
    }
    public void show(){
        System.out.println(Arrays.toString(a));
    }
}
class HighArray{
    private long[] a;
    private int nelem;
    public HighArray(int s){
        a = new long[s];
        nelem=0;
    }
    public void set(int index,long value){
        a[index]=value;
    }
    public boolean find(long value){
        // boolean exist = false; 
        for(int i = 0 ; i < nelem ; i++){
            if(a[i]==value){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
    public void insert(long value){
        a[nelem]=value;
        nelem++;
    }
    public void show(){
        // System.out.println(Arrays.toString(a));
        String d = "[";
        for(int i = 0  ; i < nelem ; i++){
            d+=Long.toString(a[i])+",";
        }
        d+="]";
        System.out.println(d);
    }
    public int size(){
        System.out.println(nelem);
        return nelem;
    }
    public boolean del(long value){
        boolean exist = false;
        int index = 0 ;
        for(int i = 0 ; i < nelem ; i++){
            if(a[i]==value){
                exist=true;
                index=i;
                break;
            }
        }
        if(exist){
            for(int i = index; i < nelem ; i++){
                a[i]=a[i+1];
            }
            nelem--;
            return true;
        }
        else{
            return false;
        }

        
    }
}
class Arrays_java{
    public static void main(String[] args){
        LowArray arr = new LowArray(10);
        // int i = 0;
        for(int i = 0 ; i < 10 ; i++){
            arr.set(i,i*i);
        }
        arr.show();
        System.out.println(arr.get_by_value(50));
        HighArray new_arr = new HighArray(10);
        new_arr.insert(101);
        new_arr.insert(101);
        new_arr.insert(101);
        new_arr.insert(101);
        new_arr.show();
        new_arr.size();
        new_arr.find(101);
        new_arr.del(101);
        new_arr.show();
        new_arr.insert(102);
        // new_arr.show();
        new_arr.del(101);
        new_arr.show();
        new_arr.find(105);
    }
}