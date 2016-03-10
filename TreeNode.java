import apple.laf.JRSUIUtils;

/**
 * Created by kvin on 3/9/16.
 */
public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data)
    {
        this.data = data;
    }

    public TreeNode find(Integer data)
    {
        if(this.data == data)
        {
            return this;
        }else
            if(data<this.data && leftChild!=null)
            {
                return leftChild.find(data);
            }
        else
                if(rightChild!=null)
                {
                    return rightChild.find(data);
                }
        return null;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}