package dz.basecore.common;

/**
 * Интерфейс простой фабрики
 *
 * @author dzevako
 * @since 13.03.2024
 */
@FunctionalInterface
public interface SimpleFactory<T>
{
    /**
     * Создать контроллер бота
     * @param code код, по которому конструируется объект
     */
    T create(String code);
}