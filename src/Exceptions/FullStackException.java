package Exceptions;

public class FullStackException extends Exception {

    public FullStackException(){
        super();
    }

    @Override
    public String getMessage(){
        return "Stack Full.";
    }

}
