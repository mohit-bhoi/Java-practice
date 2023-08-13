import java.util.Scanner;

class first{
	public static void main(String[] args) {
		Student s1 = new Student();



		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Student portal");
		System.out.println("1 student name\r\n" + //
				"2 student roll \r\n" + //
				"3 change student name\r\n" + //
				"4 change student roll no\r\n" + //
				"5 view detail");
		
					
		int num = sc.nextInt();
		switch(num){
			case 1: 
				s1.getName();
			break;
			case 2:
				s1.getRollno();
				break;
			case 3:
				System.out.println("Enter currect name of student");
				String name  = sc.nextLine();
				s1.setName(name);
				System.out.println("name hase been changed"+s1.getName());
				break;
			
			case 4:
				System.out.println("Enter currect Roll no of student");
				int num1  = sc.nextInt();
				s1.setRollno(num1);
				System.out.println("roll no hase been changed"+s1.getRollno());
				break;
			
			case 5:
					System.out.println("Name of Student: "+s1.getName());
					System.out.println("Roll no: "+s1.getRollno());
					break;
			default:
					System.out.println("choose appropriate number");
					break;

		}
		

		
	}
}

class Student{
	private String name="Mohit";
	private int rollno=5;
	

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}