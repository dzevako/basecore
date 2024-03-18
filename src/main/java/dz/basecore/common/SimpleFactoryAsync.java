package dz.basecore.common;

/**
 * Простая асинхронная фабрика
 *
 * @author dzevako
 * @since 16.03.2024
 */
public interface SimpleFactoryAsync<T>
{
    /**
     * Создать объект асинхронно
     *
     * @param code код, по которому конструируется объект
     * @param callback объект обратного вызова
     */
    void create(String code, Callback<T> callback);
}