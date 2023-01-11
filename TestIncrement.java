package day3;

public class TestIncrement {

	public static void main(String[] args) {
		int i = 2; //assign 2 to i
		int iInc = i++; //assign i++ to iInc
		System.out.println("i = " + i + " And iInc = " + iInc);
		
		i = 2; // reassign the value of i
		iInc = ++i; //assign ++i to iInc
		System.out.println("i = " + i + " And iInc = " + iInc);
	}

}
