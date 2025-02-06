//WAP to find the sum of diagonal elements of a n*n matrix. if LD is greater than RD, print the transpose of the original matrix. Otherwise print the sum of both diagonal.
import java.util.Scanner;
class SumofDiagonalMatrix{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[][] arr=new int[n][n];
int LD=0, RD=0;
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
arr[i][j]=sc.nextInt();
}
}
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
if(i==j){
LD+=arr[i][j];
}
if(i+j==n){
RD+=arr[i][j];
}
}
}
if(LD>RD){
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
System.out.print(arr[j][i]);
}
System.out.println();
}
}
else{
System.out.println(LD+RD);
}
}
}