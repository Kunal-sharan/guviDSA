class pattern1{
    public static void main(String args[]){
        int r=5;
        int c=6;
        System.out.println();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if (i==0 || i==r-1 || j==0 || j==c-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
        }
        System.out.println();
    }
}
}