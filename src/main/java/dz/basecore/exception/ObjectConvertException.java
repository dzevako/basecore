package dz.basecore.exception;

/**
 * Ошибка конвертации объекта
 *
 * @author dzevako
 * @since 28.02.2024
 */
public class ObjectConvertException extends RuntimeException
{
    /**
     * Конструктор с 2 параметрами
     * @param object объект (идентификатор, код, и т.д.)
     * @param e исключение
     */
    public ObjectConvertException(Object object, Exception e)
    {
        this("Object", object, e);
    }

    /**
     * Конструктор с 3 параметрами
     * @param objectType тип объекта
     * @param object объект (идентификатор, код, и т.д.)
     * @param e исключение
     */
    public ObjectConvertException(String objectType, Object object, Exception e)
    {
        super("Error convert %s '%s' with Exception '%s'"
                .formatted(objectType, object.toString(), e.getMessage()));
    }
}