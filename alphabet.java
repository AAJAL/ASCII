
public class alphabet {
	
	public static void main(String[] args) {
		char letter = 97;
		
		for(int i = 0; i < 26; i++) {
			System.out.print(letter++ +" ");
		}
		
		System.out.println();
		
		char uppercaseLetter = 65;
		
		for(int i = 0; i < 26; i++) {
			System.out.print(uppercaseLetter++ +" ");
		}
	}

}