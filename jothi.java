# MY-DOCUMENT

public class jklb {

	
	public static void main(String[] args) {
		 System.out.println("Enter the string");
		 
	        String s=new String("hai hello hhh gffd ghv");
	 
	        int count = 1;
	 
	        for (int i = 1; i < s.length(); i++)
	        {
	            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
	            {
	                count++;
	            }
	        }
	 
	        System.out.println("Number of words in a string = "+count);
	    }
	}


