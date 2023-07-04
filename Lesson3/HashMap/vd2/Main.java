package HashMap.vd2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int a[][]= new int [100][100]; 
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        for (int j=1; j<=2*n; ++j){
            a[0][j]=j;
        }

        for (int i=1; i<=m; ++i){
            int k= input.nextInt();
            if (k ==0)
            tt2(n,i);
            else
            tt1(n,i,k);

        }
        
        input.close();
        
        for (int i=1; i<=2*n; ++i)
        System.out.print(a[m][i]+" ");
    }
    public static void tt1(int n, int i,int k){
        int temp= 2*n-k;
        for (int j=1; j<= temp ; ++j){
            a[i][j]= a[i-1][k+j];
        }
        for (int j=1; j <= k; ++j){
            a[i][temp+j]= a[i-1][j];
        }
    }
    public static void tt2(int n, int i){
        for (int j=1, k=1; k<=n ; k++, j+=2){
            a[i][j]= a[i-1][k];
            a[i][j+1]= a[i-1][n+k];
        }
    }
}
