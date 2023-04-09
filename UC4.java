package employeewage;

public class UC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			final int Parttime = 1;
	        final int Fulltime = 2;
	        final int Wageperhour = 20;
	        /*
	         * Solving using Switch Case Statement
	         */
	        int empType = (int) (Math.random() * 100) % 3;
	        int workingHours = 0;
	        switch (empType)
	        {
	            case Fulltime:
	                System.out.println("Employee is Present Full time");
	                workingHours = 8;
	                break;
	            case Parttime:
	                System.out.println("Employee is Present Part time");
	                workingHours = 8;
	                break;
	            default:
	                System.out.println("Employee is Absent");    
	        }
	        int wage = workingHours * Wageperhour;
	        System.out.println("Employee Daily Wage is " + wage);
	    }
	}
	
