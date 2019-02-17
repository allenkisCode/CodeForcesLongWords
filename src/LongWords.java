import java.util.Scanner;

public class LongWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] words = new String[n];
		
		sc.nextLine();
		for(int i=0;i<words.length;i++){
			
			words[i] = sc.nextLine();
		}
		
		for(String word : words){
			
			if(word.length()>10){
				System.out.println(word.substring(0, 1)+(word.length()-2)+word.substring(word.length()-1, word.length()));
			}else{
				System.out.println(word);
			}
		}

	}

}
