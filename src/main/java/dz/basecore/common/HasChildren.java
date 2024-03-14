package dz.basecore.common;

import java.util.List;

/**
 * Интерфейс наличия потомков
 *
 * @author dzevako
 * @since Feb 9, 2018
 */
@FunctionalInterface
public interface HasChildren<T>
{
    /**
     * Получить список потомков
     */
    List<T> getChildren();
}
