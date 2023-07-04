import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // Bai 1 : dao nguoc chuoi
        Scanner input = new Scanner(System.in);
        Stack <Character> st= new Stack<Character>();

        System.out.print("nhap chuoi: ");
        String s= input.nextLine();

        for (int i=0; i<s.length(); ++i){
            st.push(s.charAt(i));
        }

        while (!st.isEmpty()){
            System.out.print(st.pop());
        }
        
        // Bai 2: Chuyen he thap phan sang nhi phan
        System.out.println();
        System.out.print("Chuyen tu he thap phan sang nhi phan: ");
        Stack <Integer> bin= new Stack<Integer>();
        int num= input.nextInt();
        while (num !=0){
            bin.push(num%2);
            num = num/2;
        }
        while (!bin.isEmpty()){
            System.out.print(bin.pop());
        }
    }
}
