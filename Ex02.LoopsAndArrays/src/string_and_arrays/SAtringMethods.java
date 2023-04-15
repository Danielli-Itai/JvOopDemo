package string_and_arrays;

public class SAtringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abcdef = "abcdef";
		
		String cd = abcdef.substring(2,4);
		System.out.println("cd is "+cd);
		
		char b = abcdef.charAt(1);
		System.out.println("b is "+b);
		  
		String c = abcdef.substring(2,3);
		  System.out.println("c is "+c);
		  
		int indexofc = abcdef.indexOf(c);
		System.out.println("indexofc is "+indexofc); 

	}

}
