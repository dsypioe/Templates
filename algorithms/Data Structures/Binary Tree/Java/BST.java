import java.io.*;
import java.util.*;

class Node<Undefined extends Comparable<Undefined>>
{
    // Take any data type
    Undefined data;
    Node<Undefined> left, right;

    // Custom constructor that sets the nodes data to the param passed
    Node(Undefined data)
    {
        this.data = data;
    }

    // Function getData 
    public Undefined getData()
    {
        return data;
    }
}

public class BST<Undefined extends Comparable<Undefined>>
{
    private Node<Undefined> root = null;

    private boolean 

    // Wrapper for the insert funciton
    public void insert(Undefined data)
    {
        root = insert(root, data);
    }

    // Insert a Node.
    // If the list is empty, define the contets of the root with the undefined
    // data param passed.
    // Otherwise, the data is inserted based upon the rule: go left if data being 
    // inserted is less than the data at the current node, go right if the data 
    private Node<Undefined> insert(Node<Undefined> root, Undefined data)
    {
        if (root == null)
        {
            return new Node<Undefined>(data);

            int comparison = root.getData().compareTo(data);

            if (comparison < 0)
                root.left = insert(root.left, data);
            else if (comparison > 0)
                root.right = insert(root.right, data);
        }
    }

    public void delete(Undefined data)
    {

    }

    private Node<Undefined> delete(Node<Undefined> root, Undefined data)
    {

    }

    private Undefined findMax(Node<Undefined> root)
    {

    }

    public boolean contains(Undefined data)
    {

    }

    public void inorder()
    {

    }
    
    public void inorder()
    {

    }

    public void postorder()
    {

    }

    public static void main(String [] args)
    {

    }
}