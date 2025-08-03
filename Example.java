import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("-------------------------------------------------------------");
        System.out.println("|                  salary information system                |");
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        System.out.println("[1]Calculate Income Tax");
        System.out.println("[2]Calculate Annual Bonus");
        System.out.println("[3]Calculate Loan amount");
        System.out.println();
        System.out.print("Enter option to continue: ");
        int option=input.nextInt();
        System.out.println();
        
        switch(option){
			case 1:
				System.out.println("----------------------------------------------------------");
                System.out.println("|                 Calculate income tax                   |");
                System.out.println("----------------------------------------------------------");
                System.out.println();
                System.out.print("Input Employee name  -");
                String name1=input.next();
                System.out.print("Input Employee salary -");
                double salary=input.nextDouble();
                double tax=0;
                double remaining=salary-100000;
				if (salary<=100000){
                    System.out.println("No tax is charged up to Rs.100000");
                 }else if(salary<=141667){
					 tax=(salary-100000)*0.06;
				 }else if(salary<=183333){
					 tax=2500+(salary-141667)*0.12;
				 }else if(salary<=225000){
					 tax=2500+5000+(salary-183337)*0.18;
				 }else if(salary<=226667){
					 tax=2500+5000+7500+(salary-225000)*0.24;
				 }else if(salary<=308333){
					 tax=2500+5000+7500+10000+(salary-266667)*0.30;
				 }else{	 	 	 	 
					 tax=2500+5000+7500+10000+12500+(salary-308333)*0.36; 
                 }
                    System.out.println("You have to pay income tax per month Rs : " + tax);
                
                break;
                
                case 2:
                System.out.println("------------------------------------------------");
                System.out.println("|              calculate annual bonus           |");
                System.out.println("------------------------------------------------");
                System.out.println();
                System.out.print("Input Employee name-");
                String name2=input.next();
                System.out.print("Input Employee salary-");
                double salaryBonus=input.nextDouble();
                double bonus=0;

                if (salaryBonus<100000){
                    bonus=5000;
                }else if(salaryBonus<=199999){
                    bonus=salaryBonus*10/100;
                }else if(salaryBonus<=299999){
                    bonus=salaryBonus*15/100;
                }else if(salaryBonus<=399999){
                    bonus=salaryBonus*20/100;
                }else{
                    bonus=salaryBonus*35/100;
                }
                System.out.println("Annual bonus: rs." +bonus);
                break;
                
                
				case 3:
				System.out.println("--------------------------------------------------");
				System.out.println("|              Calculate Loan Amount              |");
				System.out.println("--------------------------------------------------");
				System.out.println();

				System.out.print("Input Employee name - ");
				String name=input.next();
				System.out.print("Input Employee Salary - ");
				double Salary=input.nextDouble();
				System.out.print("Enter number of years- ");
				int years=input.nextInt();
				System.out.println();

				if (Salary>50000&&years<= 5){
				double installment=Salary*60/100;
				int months=years*12;
				double monthlyrate=0.15/12;

				double power=Math.pow(1+monthlyrate,months);
				double num=power-1;
				double den=monthlyrate*power;

				double loanamount=installment*(num/den);
				int loan=(int)((loanamount+500)/1000)*1000;

				System.out.println("You can get Loan amount: Rs. " +loan);
				}else {
				System.out.println("You cannot get a loan because your salary is less than Rs.50000 or years exceed 5.");
				}
				break;
			}
		}
}

                
