package dz.basecore.common;

/**
 * Объект, имеющий название
 *
 * @author dzevako
 * @since Nov 1, 2014
 */
@FunctionalInterface
public interface HasTitle
{
    /**
     * Получить название объекта
     */
    String getTitle();
}
