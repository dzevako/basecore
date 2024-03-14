package dz.basecore.exception;

/**
 * Ошибка аутентификации
 *
 * @author dzevako
 * @since 08.03.2024
 */
public class AuthenticationException extends RuntimeException
{
    public AuthenticationException(String message, Exception cause)
    {
        super(message, cause);
    }
}