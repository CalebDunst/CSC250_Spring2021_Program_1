
public class Driver {
	public static int b;
	public static void main(String[] args){
		stringVowels("Philippians");
		System.out.println("There are " + b + " vowels in this word.");
	}
		static int stringVowels(String s) {
	
			String book = s;
		for(int a = 0; a < book.length(); a++) {
			
			char i = book.charAt(a);
			if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				b = b + 1;
			}
			
		}return b;
		}
	
}
