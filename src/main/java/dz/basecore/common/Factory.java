package dz.basecore.common;

import java.util.Map;

/**
 * Интерфейс фабрики
 *
 * @author dzevako
 * @since Mar 11, 2018
 */
public interface Factory<T> extends SimpleFactory<T>
{
    /**
     * Создать контроллер бота
     * @param code код, по которому конструируется объект
     */
    default T create(String code)
    {
        return create(code, Map.of());
    }

    /**
     * Создать объект
     * @param code код, по которому конструируется объект
     * @param options дополнительные свойства или параметры
     */
    T create(String code, Map<String, Object> options);
}
