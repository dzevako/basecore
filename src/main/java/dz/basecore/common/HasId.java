package dz.basecore.common;

/**
 * Интерфейс объекта, имеющего идентификатор id
 *
 * @author dzevako
 * @since Jan 8, 2017
 */
@FunctionalInterface
public interface HasId
{
    /**
     * Получить идентификатор объекта
     */
    long getId();
}
