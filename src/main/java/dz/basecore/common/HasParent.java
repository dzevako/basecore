package dz.basecore.common;

/**
 * Интерфейс, дающий возможность получить родителя объекта
 *
 * @author dzevako
 * @since Feb 26, 2018
 */
@FunctionalInterface
public interface HasParent<T>
{
    /**
     * Получить родителя
     */
    T getParent();
}
