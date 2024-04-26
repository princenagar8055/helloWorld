package bank;

public interface Bank {
    public void deposite(double amount)throws invalidamountException;
    public double withdraw(double amount)throws insufficientfundException;
    public void balanceEnquiry();

}
