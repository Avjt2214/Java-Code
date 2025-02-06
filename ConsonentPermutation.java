/*You are given a string S and your task is to find and return the count of permutation formed by fixing the positions of the vowels present in the string.

Note:
• Ensure the result is non-negative
• If there are no consonants then return 0.
Input1:
ABC
Output2:

2*/
import java.util.*;
class ConsonentPermutation{
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int consonentPermutation(String a){
        char[] arr=a.toCharArray();
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                count++;
            }
        }
        int total=a.length()-count;
        return (fact(total));
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    System.out.println(consonentPermutation(a));
	}
}
