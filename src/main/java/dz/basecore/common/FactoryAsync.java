package dz.basecore.common;

import java.util.Map;

/**
 * @author dzevako
 * @since 16.03.2024
 */
public interface FactoryAsync<T> extends SimpleFactoryAsync<T>
{
    /**
     * Создать объект асинхронно
     *
     * @param code код, по которому конструируется объект
     * @param options дополнительные свойства или параметры
     * @param callback объект обратного вызова
     */
    void create(String code, Map<String, Object> options, Callback<T> callback);
}