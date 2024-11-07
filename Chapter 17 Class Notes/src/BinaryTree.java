/**
    A binary tree in which each node has at most two children.
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028
    873983000028

*/
public class BinaryTree
{
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinaryTree()
    {
         root=null;
    } 

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public BinaryTree(Object rootData) 
    {
        this.root=new Node();
        root.data=rootData;
        root.right=null;
        root.left=null;
    }

    /**
        Constructs a binary tree.
        @param rootData the data for the root
        @param left the left subtree
        @param right the right subtree
    */
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
    {
        this(rootData);    
        this.root.left=left.root;
        this.root.right=right.root;
    }
    
    static class Node
    {
       public Object data; 
       public Node right;
       public Node left;
    }

    /**
        Returns the height of the subtree whose root is the given node.
        @param n a node or null
        @return the height of the subtree, or 0 if n is null
    */
    private static int height(Node n)
    {
        if(n==null){
        return 0;}
        return 1+Math.max(BinaryTree.height(n.left), BinaryTree.height(n.right));

    }

    /**
        Returns the height of this tree.
        @return the height
    */
    public int height()
    {
        return BinaryTree.height(this.root);
    }

    /**
        Checks whether this tree is empty.
        @return true if this tree is empty
    */
    public boolean isEmpty()
    {
         return this.root==null;
    }

    /**
        Gets the data at the root of this tree.
        @return the root data
    */
    public Object data()
    {
         return null;
    }
    
    /**
        Gets the left subtree of this tree.
        @return the left child of the root
    */
    public BinaryTree left() 
    { 
        BinaryTree golden_experience_reqiuem=new BinaryTree();
        golden_experience_reqiuem.root=this.root.left;
        return golden_experience_reqiuem;
    }

    /**
        Gets the right subtree of this tree.
        @return the right child of the root
    */
    public BinaryTree right() 
    { 
        BinaryTree golden_experience_reqiuem=new BinaryTree();
        golden_experience_reqiuem.root=this.root.right;
        return golden_experience_reqiuem;
    }
}
