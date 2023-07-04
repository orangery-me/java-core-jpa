package vd2;

@FunctionalInterface
interface getSum{
    public int get(int a, int b);
}

class Operation{
    public static int plus(int a, int b){
        return a+b;
    }
    
}

public class Demo2 {
    
    public static void main(String[] args) {
        int a=4, b=6;
        int sum= doAction(a,b,Operation::plus);
        System.out.println(sum);

    }

    public static int doAction(int a, int b, getSum x){
        return x.get(a, b);
    }

}
