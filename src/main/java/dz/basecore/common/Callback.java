package dz.basecore.common;

/**
 * Объект обратного вызова
 *
 * @author dzevako
 * @since 02.02.21
 */
@FunctionalInterface
public interface Callback<T>
{
    void onSuccess(T value);

    default void onFailure(Exception e) {}
}
