/*Second largest element from command line input*/
class Main{
    int second_largest(String[] args){
        if (args.length < 2) {
            System.out.println("Please provide at least two integers.");
        }
        int largest=Integer.parseInt(args[0]);
        int second_largest=Integer.parseInt(args[0]);
        for(int i=0; i<args.length; i++){
            int num=Integer.parseInt(args[i]);
            if(largest<num){
                second_largest=largest;
                largest=num;
            }
            else if(largest>num&&second_largest<num){
                second_largest=num;
            }
        }
        return second_largest;
    }
	public static void main(String[] args){
	    if (args.length == 0) {
            System.out.println("Please provide integers as command-line arguments.");
            return;
        }
		Main obj=new Main();
		System.out.println("Second largest element is:" + obj.second_largest(args));
	}
}
