package lec13_03_java_conditional_statements;

public class I_use_of_switch_as_nested {

	public static void main(String[] args) {
		// C - CSE, E - ECE, M - Mechanical
		
		char department = 'A';

		int collegeYear = 1;
		
		switch (collegeYear) {
		
		case 1:
			System.out.println("English, Maths, Science");
			break;

		case 2:
			switch (department) {
			case 'C':
				System.out.println("Operating System, Java, Data Structure");
				break;
			case 'E':
				System.out.println("Micro processors, Logic switching theory");
				break;
			case 'M':
				System.out.println("Drawing, Manufacturing Machines");
				break;
			default:
				System.out.println("Please add a valid Department");
				break;
			}
			break;
			
		case 3:
			switch (department) {
			case 'C':
				System.out.println("Computer Organization, MultiMedia");
				break;
			case 'E':
				System.out.println("Fundamentals of Logic Design, Microelectronics");
				break;
			case 'M':
				System.out.println("Internal Combustion Engines, Mechanical Vibration");
				break;
			default:
				System.out.println("Please add a valid Department");
				break;
			}
			break;	
		
		case 4:
			switch (department) {
			case 'C':
				System.out.println("Data Communication and Networks, MultiMedia");
				break;
			case 'E':
				System.out.println("Embedded System, Image Processing");
				break;
			case 'M':
				System.out.println("Production Technology, Thermal Engineering");
				break;
			default:
				System.out.println("Please add a valid Department");
				break;
			}
			break;
		}

	}

}
