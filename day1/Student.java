package week1.day1;

public class Student {
	
	String studentName= ("Meera");
	long rollNo= 69907123;
	String collegeName= ("Ethiraj");
	int markScored= 400;
	float cgpa=9.1f;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student scoreCard=new Student();
		System.out.println(scoreCard.studentName);
		System.out.println(scoreCard.rollNo);
		System.out.println(scoreCard.collegeName);
		System.out.println(scoreCard.markScored);
		System.out.println(scoreCard.cgpa);
	}

}
