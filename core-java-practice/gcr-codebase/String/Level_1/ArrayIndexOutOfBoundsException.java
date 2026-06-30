class Main{
    public static void main(String[] args){
        String[] a={"A","B","C"};
        try{
            System.out.println(a[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}