//WAP to take a n*n square matrix and print the boundary elements of the matrix
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}