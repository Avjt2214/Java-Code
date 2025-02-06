/*Write a program to find the average of the first P multiples of an integer N.*/
import java.util.*;
class AvgOfMultiples{
    public static int average(int N, int P){
        int sum=0;
        for(int i=1; i<=P; i++){
            sum+=N*i;
        }
        int avg=sum/P;
        return avg;
    }
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    int N=sc.nextInt();
	    int P=sc.nextInt();
		System.out.println(average(N,P));
	}
}