
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

    public static int doAction(int a, int b, getSum x){
        return x.get(a, b);
    }
    public static void main(String[] args) {
        int a=4, b=6;
        // C1: khi gọi method doAction, mà method này có tham số là một method khác trong
        // FunctionalInterface(FI), ta có thể truyền vào một method references
        int sum= doAction(a,b,Operation::plus);
        System.out.println(sum);
        

        // C2: Th này ta truyền thẳng tham số obj có dạng FI
        // Nhưng trước hết, cần định nghĩa hàm đc implements từ FI bằng Lambda Expression
        getSum s= (c,d)->c+d;
        int res= doAction(a, b, s);
        System.out.println(res);

        // C3: sử dụng anonymous class
        int res2= doAction(a,b, new getSum() {
            public int get(int a, int b){
                return a+b;
            }
        } );
        System.out.println(res2);
    }


}
