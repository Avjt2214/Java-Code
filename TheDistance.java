/*The Distance
Jim has a password which is represented by a string S containing English alphabets [a-z] in lower case and numbers [0-9]. 
The distance between two characters can be calculated as the difference between their respective indices. 
Your task is to find and return an integer value representing the maximum distance between two non-similar characters within the given password S.
Note: The distance between two alphabets which are adjacent to each other is 1.

Input Specification:
input1 : A string S containing English alphabets [a-z] in lower case and numbers [0-9]
Output Specification:
Return an integer value representing the maximum distance between two non-similar characters within the given password S.

Example 1:
input1 : abc10a
Output : 4

Explanation:
The input string S has many characters, below are a few of the max distances among two non-similar elements.
1. S[1] to S[5]: a and 0 in abc10a, with distance of 4.
2. S[2] to S[6]: b and a in abc10a, with distance of 4.
For the remaining combinations the distance is less than 4. So the maximum distance
between two non-similar elements is 4, therefore 4 is returned as the output.

Example 2:
input1 : bbbb
Output : 0

Explanation:
Here the string S contains all similar elements, there are no two elements to compare,
hence the maximum distance between two non-similar elements is 0. Therefore, 0 is
returned as the output.
*/
import java.util.*;
class Main{
    public static int func(){
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        int max_distance=0;
        char[] arr=x.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    max_distance=Math.max(max_distance, (j-i));
                }
            }
        }
        return max_distance;
    }
	public static void main(String[] args){
		System.out.println(func());
	}
}