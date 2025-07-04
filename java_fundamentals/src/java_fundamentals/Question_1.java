package java_fundamentals;	
public class Question_1{
	public static void main(String[] args) {
		if(args.length!=6) {
			System.out.println("Please provide exactly six command-line arguements:<company1><type1<location1><company2><type2><location2>");
			return;
			}	
	{
	System.out.println(args[0] +" "+args[1]+" "+ args[2]);
	System.out.println(args[3]+" "+args[4]+" "+args[5]);
	}
}
}