/*	Output
 *  a b c d e f g h i j k l m n o p q r s t u v w x y z 
 *  	A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
 */
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
