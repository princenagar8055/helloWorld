package bank;

public class invalidamountException extends Exception {
    public invalidamountException(){
        super();
    }
    public invalidamountException(String message ){

        super(message);
    }

}