public class EmpWage{
	static final int IS_FULL_TIME =1;
	public static void main(String[]args){
		 System.out.println("Welcome to employee wage computation ");
 		double empCheck =Math.floor(Math.random()* 10) % 2;
 		if (empCheck == IS_FULL_TIME)
    			System.out.println("Employee is Present");
 		else
    			System.out.println("Emplyee is Absent");
 	}
}