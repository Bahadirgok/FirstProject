package Day9;

public class MultiBranchIfStatementIntro {

	public static void main(String[] args) {
		
		// Grade book
		int score = 75 ;
		
		//if the score is between 90-100 A
		//if the score is between 80-90 B
		//if the score is between 70-80 C
		//ELSE D and print study harder
		//80<score>89 ?
		
		if(score >= 90) {
			System.out.println("You got A");
			
		}else 
			if(score >=80 && score <90) {
			System.out.println("You got B");
			
		}else 
			if(score>=70 && score<80) {
			System.out.println("You got C");
	
		}else {
			System.out.println("Study Harder");
		}

	}

}
