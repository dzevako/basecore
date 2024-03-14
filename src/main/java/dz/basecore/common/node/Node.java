package dz.basecore.common.node;

import dz.basecore.common.HasParent;

/**
 * Базовый класс узла
 *
 * @author dzevako
 * @since Feb 26, 2018
 */
public class Node<T> implements HasParent<Node<T>>
{
    protected T object;
    private Node<T> parent;

    public Node(T object)
    {
        this.object = object;
    }

    public T get()
    {
        return object;
    }

    public int getDepth()
    {
        Node<T> node = this;
        int depth = 0;
        while (!node.isRoot())
        {
            node = node.getParent();
            depth++;
        }
        return depth;
    }

    @Override
    public Node<T> getParent()
    {
        return parent;
    }

    public Node<T> getRootNode()
    {
        Node<T> node = this;
        while (!node.isRoot())
        {
            node = node.getParent();
        }
        return node;
    }

    public boolean isRoot()
    {
        return parent == null;
    }

    protected void setParent(Node<T> parent)
    {
        this.parent = parent;
    }
}
