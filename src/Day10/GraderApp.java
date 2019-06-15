package Day10;
import java.util.Scanner;

public class GraderApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Score Please");
		
		int score = scan.nextInt();
		
	    if(score >100 || score < 0) {
		System.out.println("invalid number");
	    
	    } else if(score > 90) {
			System.out.println("Great Score: A !");
			
		} else if( score > 80) {
			System.out.println("Good Score: B !!");
			
		} else if (score > 70) {
			System.out.println("OK Score: C");
			
			
		}else {
			System.out.println("Study Harder !!!");
		}

//	    if (score > 90){
//      System.out.println("Great score : A!");
//    }
//    if (score > 80 && score <= 90) {
//      System.out.println(" Good score : B !!");
//    }
//    if (score > 70 && score <= 80) {
//      System.out.println(" Good score : C !!");
//    }
//    
//    if (score < 70) {
//      System.out.println(" study Harder !!");
//    }
		
		
	}

}
