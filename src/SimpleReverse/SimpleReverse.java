package SimpleReverse;

import java.util.*;

public class SimpleReverse {
	
	  public static String reverse(String s)
	  {
	        char arr[] = s.toCharArray();
	        int start = 0;
	        int end = arr.length - 1;
	        while (start < end)
	        {
	            char temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	        return new String(arr);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		 System.out.println(reverse(s));

	}

}
