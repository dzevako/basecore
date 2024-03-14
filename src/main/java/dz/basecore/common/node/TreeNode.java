package dz.basecore.common.node;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import dz.basecore.common.HasChildren;

/**
 * Дерево элементов
 *
 * @author dzevako
 * @since Feb 9, 2018
 */
public class TreeNode<T> extends Node<T> implements HasChildren<TreeNode<T>>
{
    private final List<TreeNode<T>> children = new ArrayList<>();

    public TreeNode(T object)
    {
        super(object);
    }

    public void addChild(@Nullable TreeNode<T> node)
    {
        if (node != null)
        {
            children.add(node);
            node.setParent(this);
        }
    }

    @Override
    public List<TreeNode<T>> getChildren()
    {
        return children;
    }

    public boolean isLeaf()
    {
        return children.isEmpty();
    }
}