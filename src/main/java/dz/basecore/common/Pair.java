package dz.basecore.common;

/**
 * Пара объектов
 * @author dzevako
 * @since Nov 8, 2014
 */
public class Pair<X, Y>
{
    /** Первый элемент */
    private final X first;

    /** Второй элемент */
    private final Y second;

    public Pair(X first, Y second)
    {
        this.first = first;
        this.second = second;
    }

    public X getFirst()
    {
        return first;
    }

    public Y getSecond()
    {
        return second;
    }

    @Override
    public String toString()
    {
        return first + ":" + second;
    }
}
