package training;

public class Modun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456,result=0;
	    while(n>0)
	    {
	    	int mod=n%100000;
	    	result=(result*10)+mod;
	    	n=n/100000;
	    	
	    }
	    System.out.println(result);
		

	}

}
