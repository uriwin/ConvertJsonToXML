package exceptions;

public class ReadGZIPFileException extends Exception {
    public ReadGZIPFileException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
