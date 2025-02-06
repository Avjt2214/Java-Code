/*Knowledge Enhancement
Alex is a high school student who loves reading and has a summer break coming up.
Alex has a list of books that he want to read, with each book's estimated reading time stored in an array A. 
Alex has N hours available during the break for reading. Your task is to help Alex find and return an integer value 
representing the maximum number of books Alex can read without exceeding their total available reading hours.

Input Specification:
input1 : An integer array A, representing estimated time to read each book.
input2 : An integer value N, representing the total number of hours available for reading.
input3 : An integer value, representing the size of the array A

Output Specification:
Retur an integer value representing the maximum number of books Alex can read
without exceeding their total available reading hours.

Example 1:
input1 : {4,2,3,1}
input2 : 5
input3 : 4
Output : 2
Explanation:
Here N=5 and Alex has 4 books with reading times of 4, 2, 3, and 1 hours respectively then:
. The optimal way to utilize the 5 hours is to read the books with reading times of 2 and 1 hour.
. If he starts reading the book withs 3 hours, then it will exceed the time limit.
The maximum number of bloks that can be read is 2. Hence, 2 is returned as output.

Example 2:
input1 : (5,3,2,8)
input2 : 10
input3 : 4
Output : 3
*/
import java.util.*;
class Main{
    public static int func(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
        int time=0, max_book=0;
        Arrays.sort(arr);
        for(int i=0; i<size; i++){
            if(time+arr[i]<=N){
                time+=arr[i];
                max_book++;
            }
            else {
                break;
            }
        }
        return max_book;
    }
	public static void main(String[] args){
		System.out.println(func());
	}
}