package dz.basecore.common;

/**
 * Интерфейс видимости объекта
 * @author dzevako
 * @since Mar 9, 2015
 */
public interface HasVisible
{
    /**
     * Признак видимости объекта
     */
    boolean isVisible();

    /**
     * Установить признак видимости объекта
     */
    void setVisible(boolean visible);
}
