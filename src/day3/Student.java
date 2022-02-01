package day3;

public class Student {

		int score=0;

		public static void main(String[] args) {
		

		Student ravi =new Student();  
		Student priya= new Student (); 
		Student krishna= new Student();


		ravi.score=10; 
		priya.score=20;

		krishna.score = ravi.score+priya.score;

		System.out.println("Ravi "+ravi.score); 
		System.out.println("Priya "+priya.score); 
		System.out.println("Krishna "+krishna.score);
	
	}
}