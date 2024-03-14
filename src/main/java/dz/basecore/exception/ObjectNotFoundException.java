package dz.basecore.exception;

/**
 * Исключение, выбрасываемое, когда объект с указанным идентификатором не найден
 *
 * @author dzevako
 * @since 28.02.2024
 */
public class ObjectNotFoundException extends RuntimeException
{
    /**
     * Конструктор с 1 параметром
     * @param object объект
     */
    public ObjectNotFoundException(Object object)
    {
        this("Object", object);
    }

    /**
     * Конструктор с 2 параметрами
     * @param objectType тип объекта
     * @param object объект
     */
    public ObjectNotFoundException(String objectType, Object object)
    {
        super("%s '%s' is not found.".formatted(objectType, String.valueOf(object)));
    }
}
