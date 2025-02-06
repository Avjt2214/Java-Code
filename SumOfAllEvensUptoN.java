/*You are given a function that takes an integer N. Write a program that returns the sum of all the even numbers which are less than or equal to N.*/
import java.util.*;
class SumOfAllEvensUptoN{
    public static int sum(int N){
        int evensum=0;
        for(int i=0; i<=N; i++){
            if(i%2==0){
                evensum+=i;
            }
        }
        return evensum;
    }
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    int N=sc.nextInt();
		System.out.println(sum(N));
	}
}