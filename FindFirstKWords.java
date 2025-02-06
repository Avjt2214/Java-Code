/*Find first K words of a String*/
import java.util.*;
class FindFirstKWords{
	public static String count(String n, int k){
	    int count=0;
	    String res="";
	    char ch[]=n.toCharArray();
	    for(int i=0; i<ch.length; i++){
	        if(ch[i]==' '){
	            count++;
	        }
	        if(count==k){
	            break;
	        }
	        res+=ch[i];
	    }
	    return res;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int k=sc.nextInt();
		/*int arr[]=new int[n];
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}*/
		System.out.println(count(n, k));
	}
}
