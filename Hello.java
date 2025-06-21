class hello
{
    public static void main(String[] args) 
    {
        char i='A';
        System.out.println(i+1);// implicit type casting from bool-->int
        //explicit typecasting data_type1-->datatype2 ==> value in data_type1 % max_val of data_type2 
        float f=5.8f;
        int n_f=(int)f;
        System.out.println(n_f);
        int c=258;
        byte n_c=(byte)c;
        System.out.println(n_c);
        //Type promotion
        byte a=10;
        byte b=30;
        // byte b_r=a*b; won't work 
        int r=a*b;//a,b got type promotion from byte --> int as 300 > byte
        
        System.out.println(r);

    } 
}