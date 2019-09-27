
public class RandomCharacter {
	
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}//end getRandomCharacter
	
	public static char getRandomLowercaseLetter() {
		return getRandomCharacter('a', 'z');
	}//end getRandomLowercaseLetter
	
	public static char getRandomUppercaseLetter() {
		return getRandomCharacter('A', 'Z');
	}//end getRandomUppercaseLetter
	
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}//end getRandomDigitCharacter
	
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
	
}//end class
