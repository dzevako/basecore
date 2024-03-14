package dz.basecore.common;

/**
 * Интерфейс, описывающий объект с кодом
 *
 * @author dzevako
 * @since Dec 11, 2015
 */
@FunctionalInterface
public interface HasCode
{
    /**
     * Получить код объекта
     */
    String getCode();
}
