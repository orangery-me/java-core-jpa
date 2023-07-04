@FunctionalInterface
interface FI{
    public int plus(int a, int b);
}

public class Demo3 {
    public static int getSum(int a, int b){
        return a+b;
    }
    public int doAction(int a, int b, FI x){
        return x.plus(a, b);
    }
    public static void main(String[] args) {
        Demo3 d= new Demo3();
        // FI x;
        int a=9, b=10;
        int res= d.doAction(a, b, Demo3::getSum);
        System.out.println(res);
    }
}
