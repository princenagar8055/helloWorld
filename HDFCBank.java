package bank;

public class HDFCBank implements Bank {
    public double balance;
    @Override
    public void deposite(double amount)throws invalidamountException{
        if( amount<=0) {
            throw new invalidamountException(amount +"IS INVALID AMOUNT");
        }
        balance = balance + amount;
        }

    @Override
    public double withdraw(double amount) throws insufficientfundException{
     if(balance<amount){
         throw new insufficientfundException("INSUFFICIENT FUND");
     }
        balance = balance - amount;
        return amount;
    }

    @Override
    public void balanceEnquiry() {
        System.out.println("CURRENT BALANCE : "+ balance);

    }
}
