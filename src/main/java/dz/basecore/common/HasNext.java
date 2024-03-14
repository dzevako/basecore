package dz.basecore.common;

/**
 * Интерфейс, указывающий на возможность наличия и установки следующего элемента
 *
 * @author dzevako
 * @since Feb 26, 2018
 */
public interface HasNext<T>
{
    /**
     * Получить следующий элемент
     */
    T getNext();

    /**
     * Установить следующий элемент
     */
    void setNext(T next);
}
