package br.com.iser.liveloback.validation.exception;

public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ValidationException(String string) {
        super(string);
    }
}
