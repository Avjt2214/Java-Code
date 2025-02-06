/* 01. Identify maximum integer in a string
Problem Statement: 
You are given a string str of length n. Your task is to find and print the maximum integer present in the string str. 
An integer is derived by consecutive digit characters.

Note:
Print-1 if no integer is found.
If string is empty then print -2.

Input Format:
The Input consists of two lines:
The first line contains an integer, Le. п.
The second line contains the string str
The input will be read from the STDIN by the candidate

Output Format:
Print the maximum integer present in the string str. 
Print -1 if no integer is found, If string is empty then print 2 The output will be matched to the candidate's outpe printed on the STDOUT

Constraints:
1 ≤ n ≤ 100000.
Example:
Input:
39
0 33 milestone is either 12 or 75 km away
Output:
75
Explanation: str have 3 integers '33', '12' and '75', since 75 Is maximum, output is 75.
Sample input
29
I have 8 500g packets of rice
Sample Output
500
*/
import java.util.*;
class Main{
    public static int s(String input){
        int maxnum=0;
        String currentNum="";
        for(int i=0; i<input.length(); i++){
            char ch=input.charAt(i);
            if(Character.isDigit(ch)){
                currentNum+=ch;
            }
            else{
                if(!currentNum.isEmpty()){
                    maxnum=Math.max(maxnum, Integer.parseInt(currentNum));
                    currentNum="";
                }
            }
            if(!currentNum.isEmpty()){
                maxnum=Math.max(maxnum, Integer.parseInt(currentNum));
            }
        }
        return maxnum;
    }
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    String input=sc.nextLine();
		System.out.println(s(input));
	}
}