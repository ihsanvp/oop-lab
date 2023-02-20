import java.util.*;
class  tokenizer{
	public static void main(String args[]){
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter a line of numbers:");
		String input= s.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int sum=0;
		int n=0;
		while(st.hasMoreTokens()){
                 String temp = st.nextToken();
		 n= Integer.parseInt(temp);
		 System.out.println("number is:"+n);
		 sum +=n;
		}
		System.out.println("sum of the intigres is:" +sum);
		
}
}
