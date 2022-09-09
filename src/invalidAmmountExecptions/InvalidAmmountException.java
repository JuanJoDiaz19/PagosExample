package invalidAmmountExecptions;

public class InvalidAmmountException extends Exception{
    public InvalidAmmountException(double value) {
        super("El valor " + value + "No es un registro valido");
    }
}
