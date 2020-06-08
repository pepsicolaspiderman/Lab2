public class Rec4 {
    public static int fact(int n){
        int result;
        if (n==1)
            return 1;
        else {
            result = fact(n-1)*n;
            return result;
        }
    }
    public static void main(String[]args){
        Rec4 fact = new Rec4();
        System.out.println(" 5 = " + fact.fact(5));
        System.out.println(" 7 = " + fact.fact(7));
        System.out.println(" 12 = " + fact.fact(12));
        System.out.println(" 16 = " + fact.fact(16));
    }
}
