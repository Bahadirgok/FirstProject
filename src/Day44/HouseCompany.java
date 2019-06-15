package Day44;

public class HouseCompany {

	public static void main(String[] args) {
		
		House h1 = new House("single house", 5, 120000);
		House h2 = new House("town house", 2, 20000);
		House h3 = new House("apartment", 2, 10000);
		House h4 = new House("single house", 4, 110000);
		
//		immutable object means
	  //once it's created , it can not be changed
//		non-resizable -- array
	  //it can not change in size. can't shrink can't expand
	  //can we change array --yes, arr[0] = new value	
		
		
//		---WRITE ONLY OBJECT---
//		h1.setBedroom(6);
//		h3.setType("single house");
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
	}

}
