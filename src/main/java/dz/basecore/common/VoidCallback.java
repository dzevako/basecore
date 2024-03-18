package dz.basecore.common;

/**
 * Null callback
 * Создан отдельно, чтоб не передавать null
 *
 * @author dzevako
 * @since 17.03.2024
 */
public interface VoidCallback extends Callback<Void>
{
    void onSuccess();

    /**
     * Переопределено, чтоб в коде не передавать null
     */
    @Override
    default void onSuccess(Void value)
    {
        onSuccess();
    }
}