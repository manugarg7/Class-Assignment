import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int item)
    {
        data=item;
        left=right;
    }
}
public class Inverse
{
    Node root;
    void inverseLevel(Node node)
    {
        int h=height(node);
        int i;
        for(i=h;i>=1;i--)
        {
            printDisplay(node,i);
        }
    }
    void printDisplay(Node node,int level)
    {
        if(node==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.println(node.data+" ");
        }
        else if(level>1)
        {
            printDisplay(node.right,level-1);
            printDisplay(node.left,level-1);
        }
    }
      int height(Node node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            
            int lheight = height(node.left); 
            int rheight = height(node.right); 
   
          
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
    public static void main(String args[])
    {
        Inverse tree=new Inverse();
        tree.root=new Node(40);
        tree.root.left=new Node(30);
        tree.root.right=new Node(70);
        tree.root.left.left=new Node(20);
        tree.root.left.right=new Node(35);
        tree.root.right.left=new Node(50);
        tree.root.right.right=new Node(80);
        tree.inverseLevel(tree.root);
    }
}