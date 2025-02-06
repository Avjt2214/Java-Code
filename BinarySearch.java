/*Binary search*/
import java.util.*;
class BinarySearch{
    static int i=0, n, arr[], item;
    static void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.print("Enter the elements one by one..");
		for(i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("Enter the element to search for: ");
		item=sc.nextInt();
    }
    static void sort(){
        for(i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                }
            }
        }
    }
    static void search(int high, int low){
        if(low>high){
            System.out.println("Item not found");
            return;
        }
        int mid=(high+low)/2;
        if(arr[mid]==item){
            System.out.println("Item found at index: "+mid);
            return;
        }
        else if(arr[mid]>item){
            search(mid-1, low);
        }
        else{
            search(high, mid+1);
        }
    }
	public static void main(String[] args){
		input();
		sort();
		search(n-1, 0);
	}
}
