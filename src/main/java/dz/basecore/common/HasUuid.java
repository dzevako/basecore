package dz.basecore.common;

/**
 * Объект, имеющий уникальный идентификатор 
 * Universally Unique Id
 *
 * @author dzevako
 * @since Jan 8, 2017
 */
@FunctionalInterface
public interface HasUuid
{
    /**
     * Получить идентификатор объекта
     */
    String getUuid();
}
