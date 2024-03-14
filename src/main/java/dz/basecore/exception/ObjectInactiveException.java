package dz.basecore.exception;

/**
 * Исключение, выбрасываемое, когда объект с указанным идентификатором не активен
 * и не может производить какие-то действия (либо над ним)
 *
 * @author dzevako
 * @since 01.03.2024
 */
public class ObjectInactiveException extends RuntimeException
{
    /**
     * Конструктор с 1 параметром
     * @param object  объект
     */
    public ObjectInactiveException(Object object)
    {
        this("Object", object);
    }

    /**
     * Конструктор с 2 параметрами
     * @param objectType тип объекта
     * @param object объект
     */
    public ObjectInactiveException(String objectType, Object object)
    {
        this(objectType, object, "");
    }

    /**
     * Конструктор с 3 параметрами
     * @param objectType тип объекта
     * @param object объект
     * @param additionalMessage дополнительное сообщение
     */
    public ObjectInactiveException(String objectType, Object object, String additionalMessage)
    {
        super("%s id='%s' is not active. %s".formatted(objectType, object, additionalMessage));
    }
}