package Exceptions;

public class EmptyStackGenericException extends Exception {
    public EmptyStackGenericException(){
        super();
    }

    @Override
    public String getMessage(){
        return "Stack Empty.";
    }
}
