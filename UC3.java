package employeewage;

public class UC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wageOfEmployee = 20;
        int sum = 0;
        int FullDayHour=8;
        int PartTimeHour=8;

        
       
            /*
             *  Calculate the random number
             */
            double isPresent = Math.random() * 3;
        

            /*
             *  Calculate the wage of employee if employee is present
             */
            if (isPresent >= 2) {
            	 System.out.println("Employee is present");
            
            	wageOfEmployee=FullDayHour * wageOfEmployee;
                sum += wageOfEmployee;
                 }
            
            /*
             * 5) Calculate the wage of employee if employee is partially present
             */
            else if (isPresent >= 1 && isPresent < 2) {
            	  System.out.println("Employee is partial present");
            	wageOfEmployee=FullDayHour * wageOfEmployee;
                sum += wageOfEmployee;
                
            }
                  
                /*
                 *  Print if employee is absent
                 */
            else {
                    System.out.println("Employee is absent");
            }
            System.out.println("Employee earned " + sum);        
            }
}
	
