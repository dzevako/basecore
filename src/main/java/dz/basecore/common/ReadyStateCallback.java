package dz.basecore.common;

/**
 * Каллбек, работающий с ReadyState
 *
 * @author dzevako
 * @since 16.03.2024
 */
public class ReadyStateCallback<T> implements Callback<T>
{
    private final ReadyState readyState;

    public ReadyStateCallback(ReadyState readyState)
    {
        this.readyState = readyState;
        readyState.notReady();
    }

    @Override
    public void onSuccess(T value)
    {
        processValue(value);
        readyState.ready();
    }

    @Override
    public void onFailure(Exception e)
    {
        readyState.ready();
    }

    protected void processValue(T value)
    {
        // Do nothing by default
    }
}