package br.com.ctmait.addressquery.exception;


public class ContextViolationException extends RuntimeException {

    private static final String MESSAGE_ERROR = "Violação do bounded context ";

    public ContextViolationException(){
        super(MESSAGE_ERROR);
    }

    public ContextViolationException(String boundedContext){
        super(MESSAGE_ERROR + boundedContext);
    }
}