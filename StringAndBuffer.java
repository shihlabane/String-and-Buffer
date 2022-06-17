package StringBuffer;

public class TwoStringCreatOneWordFirstLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  9. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
		   the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
        If the inputs are "Hello" and "World", then the output is "HWeolrllod".
  */
		
		   String a = "Helloo";
		   String b = "World";
		   
		   int a1 = a.length();
		   int b1 = b.length();
		 
		   String strtmp ="";
		   for(int i = 0; i < a1; i++) {
			   strtmp = strtmp + a.charAt(i);
		       strtmp = strtmp + b.charAt(i);
			 
		       
		   }
			   
		   System.out.print(strtmp);   
		   
		   
	}

}
_______________________________________________________________________



package StringBuffer;

public class StringIsPalindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      //Write a Program that will check whether a given String is Palindrome or not
		
		String str = "raDAR", reverse = "";
		
		int strlength = str.length();
		
		for(int i = (strlength - 1) ; i  >= 0; --i) {
			
			reverse = reverse + str.charAt(i);
		}
		 
		
		if(str.toLowerCase().equals(reverse.toLowerCase())) {
			
			System.out.print("This is palindrome string");
		}else {
			System.out.print("This is not a palindromre");
		}
		
	}

}
_________________________________________________________________________

package StringBuffer;

public class ReturnStringWithoutX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*7. Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and 
				 otherwise return the string unchanged. If the input is "xHix", then output is "Hi".
				*/
				String strname = "hix";
				int n = strname.length();
				String a = "", b="";
				a = a + strname.charAt(0);
				b = b + strname.charAt(n-1);
				
				if(a.toLowerCase().equals("x") && b.toLowerCase().equals("x"))
			       for(int i = 1 ; i < n-1; i++)
			    	   System.out.print(strname.charAt(i));
				else
					System.out.print(strname);
			
	}

}
_______________________________________________________________

package StringBuffer;

public class ReturnStringWithouFirstAndLastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//5. Given a string, return a version without the first and last char, so
		//"Wipro" yields "ipr". The string length will be at least 2.
				 
				
				String name = "mukhethwa";
				
				int n = name.length();
			
				System.out.print(name.substring(1, n-1));
				
				
	}

}
_________________________________________________________________
package StringBuffer;

public class ReturnFirstLastStringWhereThereIsApostriphy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		  8. Return a version of the given string, where for every star (*) in the string the star and the characters 
		  immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad"
		 */
		   
		String a = "ab**cd";
		String b1 = "", b2="";
		char compChar;
		for(int i=0; i< a.length()-1; i++)
		{ 
			
			compChar = a.charAt(i);
			if(compChar =='*') {
				
				i++;
				
				for( int x = i ; x< a.length() ; x++) {
					b2 = b2 +a.charAt(x);
				}
				
		        break;
				
				
			}else {
				
				b1= b1 + a.charAt(i);
			}
			
		}
		int n = b2.length();
		System.out.print(b1.charAt(0));
		System.out.print(b2.charAt(n-1));
		
		
	}

}



