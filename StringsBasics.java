
public class StringsBasics {
	
	public static void main(String[] args) {
		
		String s1 = " Welcome ", s2 = " welcome ";
		
		boolean isEqual = s1.equals(s2);
		System.out.println(isEqual);//returns false
		
		isEqual = s1.equalsIgnoreCase(s2);//checks whether they are equal, but is not case sensative 
		System.out.println(isEqual);//returns true
		
		int x = s1.compareTo(s2);//returns -32
		System.out.println(x);
		
		x = s1.compareToIgnoreCase(s2);//returns 0
		System.out.println(x);
		
		boolean b = s1.startsWith("AAA");//Checks whether s1 has the prefix AAA
		System.out.println(b);
		
		b = s1.endsWith("AAA");//Checks whether s1 has the suffix AAA
		System.out.println(b);
		
		int s1Lenght = s1.length();
		System.out.println(s1Lenght);
		
		char firstCharacter = s1.charAt(0);
		System.out.println(firstCharacter);//Will be blank since the first character of s1 is a space
		
		String s3 = s1.concat(s2);//Combines both s1 and s2
		System.out.println(s3);
		
		String subString = s1.substring(1);//returns Welcome
		System.out.println(subString);
		
		subString = s1.substring(1, 4);//returns Wel
		System.out.println(subString);
		
		String s1LowerCase = s1.toLowerCase();//returns  welcome 
		System.out.println(s1LowerCase);
		
		String s1UpperCase = s1.toUpperCase();//returns  WELCOME 
		System.out.println(s1UpperCase);
		
		String s1WithoutWhiteSpaces = s1.trim();//returns Welcome
		System.out.println(s1WithoutWhiteSpaces);
		
		int indexOfE = s1.indexOf("e");//returns the index at the first occurrence of e
		System.out.println(indexOfE);
		
		int indexOfABC = s1.lastIndexOf("abc");//returns -1 since abc is not in s1
		System.out.println(indexOfABC);
	}

}
