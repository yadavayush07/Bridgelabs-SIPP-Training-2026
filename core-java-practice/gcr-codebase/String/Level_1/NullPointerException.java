class Main{
    static void show(){
        String s=null;
        try{
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
    public static void main(String[] args){
        show();
    }
}