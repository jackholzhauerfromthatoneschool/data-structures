/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        this.root=null;
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable obj) 
    {   
        Node newNode=new Node();
        newNode.data=obj;
        newNode.left=null;
        newNode.right=null;
    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable obj)
    {
        Node current =this.root;
        while (current!=null)
        {
            int dif= obj.compareTo(current.data);
            if (dif ==0)
            {
                return true;
            }
            else if (dif<0)
            {
                current=current.left;
            }
            else{
                current=current.right;
            }
        }
        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable obj)
    {
        Node kashimo_victim=this.root;
        Node parennt=null;
        boolean f = false;
        while (!f&&kashimo_victim!=null)
        {
            int dif = obj.compareTo(kashimo_victim.data);
            if (dif==o){
                f=true;
            }
            else{
                parennt=kashimo_victim;
                if (dif<0){
                    kashimo_victim=kashimo_victim.left;
                }
                else{
                    kashimo_victim=kashimo_victim.right;
                }
            }
            if (!f){
                return;
            }
            if(kashimo_victim.left==null||kashimo_victim.right==null)
            {
                Node newChild;
                if(kashimo_victim.left==null){
                    newChild=kashimo_victim.right;
                }
                if(kashimo_victim.right==null){
                    newChild=kashimo_victim.left;
                }
                if (parennt==null){
                    this.root=newChild;
                }
                else
                {
                    parennt.right=newChild;
                }
                return;
            }
            //remove a node with two children

            //find least one of right (;_;)
            //the least element will replace the removed node
            Node leastParent = kashimo_victim;
            Node least=kashimo_victim.right;
            while (least.left!=null){
                leastParent=least;
                least=least.left;
            }
            kashimo_victim.data=least.data;

            // Unlink the least child
            if (leastParent==kashimo_victim){
                leastParent.right=least.right;
            }
            else{
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
                leastParent.left=least.right;
            }
        }
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        print(this.root);
        System.out.println();

        //fein fein fein the walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing inthe walls are closing in
    }   

    /**
        Prints a node and all of its descendants in sorted order.
    */
    private static void print(Node parent)
    {   
        if(parent==null){
            return;
        }
        
        print(parent.left);
        System.out.println(parent.data+"");
        print(parent.right);
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
        // BST needs to be comparable objects
        public Comparable data;
        public Node left;
        public Node right;
        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            int dif=newNode.data.compareTo(data);
            if (dif<0)
            {
                if (left==null){
                    left=newNode;
                }
                else{
                    left.addNode(newNode);
                }
            }
            if (dif<0)
            {
                if (right==null){
                    right=newNode;
                }
                else{
                    right.addNode(newNode);
                }
            }
        }
    }
}



