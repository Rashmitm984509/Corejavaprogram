package com.tnsif.exception;
// Nested try and catch

public class NestedTryCatch {
	
	public static void check() {
		String str="TNS";  // data member
		
		int slength=str.length();
		
		System.out.println("stringlength"+slength);
		
		String anotherstring=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("index out of bound"+ex.getMessage());
			}
			System.out.println("String length"+anotherstring.length());
		}
		catch(NullPointerException np) {
			System.out.println("exception is thrown"+np.getMessage());
		}
	}


}
