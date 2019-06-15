package day49;

public class Action {

	public static void main(String[] args) {

		/**
		 * 
		 * 
		 */
		
		Employee e = new Employee();
//		e can only access title id
		
		FullTimeEmployee f = new FullTimeEmployee();
//		salary, insurance
//		title id coming from Employee
		
		Teacher t = new Teacher();
		
		
//		teacherId energy level
//		salary, insurance coming from Fulltime
//		title d coming from Employee
		
		Action a = Action();
		
	}

}
