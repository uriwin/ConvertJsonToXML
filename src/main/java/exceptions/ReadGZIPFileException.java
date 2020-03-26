package exceptions;

public class ReadGZIPFileException extends Exception{
    public ReadGZIPFileException(String errorMessage) {
        super(errorMessage);
    }
}
