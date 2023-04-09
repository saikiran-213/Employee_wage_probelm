package employeewage;

public class UC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Parttime = 0;
        int Fulltime = 1;
        int Wageperhour = 20;
        int sum = 0;
        int wage = 0;
	for (int day = 1; day <= 20; day++) {
		
		/*
         *  Calculate the random number
         */
        int isPresent =(int)(Math.random() *3);
    
        //Switch expression  
        switch(isPresent){  
        //Case statements  
        case 1:   
        System.out.println("Employee is present");
        wage=Fulltime *Wageperhour ;
        sum =sum + wage;
        System.out.println("Employee earned " + sum);        
        break; 
        
        case 2:  
        System.out.println("Employee is partial present");
        wage=Parttime * Wageperhour;
        sum =sum+ wage;
        System.out.println("Employee earned " + sum);        
        break;  
        

        //Default case statement  
        default:  System.out.println("Employee is absent");
        
        }
	  }

	}

}
