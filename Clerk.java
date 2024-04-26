package bank;
import java.util.Scanner;
public class Clerk {
    public static void main(String arg[]){
        try {

            Scanner scanner = new Scanner(System.in);
            Bank bank = new HDFCBank();
            String option ="";
            do{
                System.out.println("1.DEPOSITE");
                System.out.println("2.WITHDRAW");
                System.out.println("3.BALANCE ENQUIRY");

                System.out.println("ENTER OPTION NO : ");
                option = scanner.next();
                switch(option){
                    case "1":{
                        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED ");
                        double amount= scanner.nextDouble();
                        bank.deposite(amount);
                        bank.balanceEnquiry();
                        break;

                    }
                    case "2" :{
                        System.out.println("ENTER THE WITHDRAW AMOUNT");
                        double amount = scanner.nextDouble();
                    bank.withdraw(amount);
                    bank.balanceEnquiry();
                    break;
                }
                    case "3" :{
                    bank.balanceEnquiry();
                    break;
                    }
                    default:
                        System.out.println("INVALID OPTION");

                }
                System.out.println("DO YOU WANT TO CONTINUE (YES/NO)");
                option = scanner.next();

            }while(option.equals("yes"));

        }catch (invalidamountException invalidamountException){
            System.out.println("ERROR MESSAGE : " + invalidamountException.getMessage());
        }catch(insufficientfundException insufficientfundException){
            System.out.println("ERROR MESSAGE : "+ insufficientfundException.getMessage());
        }catch(Exception e){
            System.out.println("TRY AGAIN ");
        }


    }
}
