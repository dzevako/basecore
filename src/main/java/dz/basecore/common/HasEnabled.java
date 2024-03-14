package dz.basecore.common;

/**
 * Интерфейс объекта, имеющего два состояние(активное/пассивное или доступное/недоступное)
 *
 * @author dzevako
 * @since Nov 6, 2017
 */
public interface HasEnabled
{
    /**
     * Признак активности объекта
     */
    boolean isEnabled();
}
