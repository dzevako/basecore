package dz.basecore.common;

/**
 * Объект, выполняющий дейтвие по завершению всех калбеков
 *
 * @author dzevako
 * @since 16.03.2024
 */
public class ReadyState
{
    /** Действие, которое должно выполниться, когда вернутся все калбеки */
    private final Runnable action;

    /** Счетчик выполнения */
    private int counter = 0;

    public ReadyState(Runnable action)
    {
        this.action = action;
    }

    public void notReady()
    {
        counter += 1;
    }

    public void ready()
    {
        if (counter > 0)
        {
            counter -= 1;
        }
        if (counter == 0)
        {
            action.run();
        }
    }
}