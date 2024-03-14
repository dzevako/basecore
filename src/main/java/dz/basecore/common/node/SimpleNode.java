package dz.basecore.common.node;

import javax.annotation.Nullable;

import dz.basecore.common.HasNext;

/**
 * Простая нода. В отличие от древовидной имеет только одного ребенка
 *
 * @author dzevako
 * @since Feb 26, 2018
 */
public class SimpleNode<T> extends Node<T> implements HasNext<SimpleNode<T>>
{
    private SimpleNode<T> next;

    public SimpleNode(T object)
    {
        super(object);
    }

    public SimpleNode<T> getLastNode()
    {
        SimpleNode<T> node = this;
        while (!node.isLast())
        {
            node = node.getNext();
        }
        return node;
    }

    @Override
    public SimpleNode<T> getNext()
    {
        return next;
    }

    public boolean isLast()
    {
        return next == null;
    }

    @Override
    public void setNext(@Nullable SimpleNode<T> node)
    {
        if (node != null)
        {
            next = node;
            node.setParent(this);
        }
    }
}
