package dz.basecore.common;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Пул объектов, содержащий не более maxSize элементов
 *
 * @author dzevako
 * @since Sep 16, 2015
 */
public class Pool<T> extends ArrayList<T>
{
    /** Максимальное количество элементов в пуле */
    private final int maxSize;

    public Pool(int maxSize)
    {
        this.maxSize = maxSize;
    }

    @Override
    public boolean add(T e)
    {
        boolean add = super.add(e);
        if (size() > maxSize)
        {
            remove(0);
        }
        return add;
    }

    @Override
    public boolean equals(Object o)
    {
        return o instanceof Pool<?> pool && super.equals(o) && maxSize == pool.maxSize;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), maxSize);
    }
}
