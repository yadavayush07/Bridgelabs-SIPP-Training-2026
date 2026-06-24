class Main{
    public static void main(String[] args){
        double r=6378,v=4.0/3*Math.PI*r*r*r;
        System.out.println("The volume of earth in cubic kilometers is "+v+
        " and cubic miles is "+(v/4.168));
    }
}