package employeewage;

public class UC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
	     * Start with Displaying Welcome to Employee Wage Computation
	     */
		   System.out.println("Welcome to Employee Wage Computation");
		/*
		 * Check Employee is Present or Absent
		 */
		 double isPresent = Math.random()*3;
         if (isPresent >= 1) {
            System.out.println("Employee is present");
        }
         
           else {
               System.out.println("Employee is absent");
}
	}

}
