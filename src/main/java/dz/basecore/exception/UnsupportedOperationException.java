package dz.basecore.exception;

/**
 * Исключение выбрасывается, если операция не поддерживается
 * (вообще, или в текущем статусе объекта)
 *
 * @author dzevako
 * @since 06.03.2024
 */
public class UnsupportedOperationException extends RuntimeException
{
    public UnsupportedOperationException(String message)
    {
        super("Operation is not supported: %s".formatted(message));
    }
}