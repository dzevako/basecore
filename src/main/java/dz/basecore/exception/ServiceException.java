package dz.basecore.exception;

/**
 * Исключение, возникшее в механизмах сервисов во время их работы
 *
 * @author dzevako
 * @since 08.03.2024
 */
public class ServiceException extends RuntimeException
{
    public ServiceException(String message)
    {
        super(message);
    }

    public ServiceException(String message, Exception cause)
    {
        super(message, cause);
    }
}