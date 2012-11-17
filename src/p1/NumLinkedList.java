package p1;

public class NumLinkedList implements NumList
{
    private int size;
    private Node root;
    
    //Node class: Each node has a value and a next node associated with it
    private class Node
    {
        private double data;
        private Node next;
    }
    
    //NumLinkedList Constructor creates root node that will point to the first node with data
    public NumLinkedList()
    {
        root =  new Node();
        size = 0;
    }
    
    @Override
    public int size()
    {
        return size;
    }
    
    @Override
    public void insert(int i, double value)
    {
        //Catches invalid indices
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("That index is not valid. Please select a positive number");
        }
        
        Node temp = root;
        
        //If the index specified to insert is larger than the list it inserts the node at the end of the list
        if (i > size)
        {
             i = size;
        }
        
        //Cycles the values in the list until it has reached the spot where the new node is to be inserted
        for(int count = 0; count < i; count++)
        {
            temp = temp.next;
        }
        
        //Creates a new node, assigns the new node the specified value, 
        //sets the next values of the new node and the node before it so that the list is correctly linked
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = temp.next;
        temp.next = newNode;
        
        //Increases the size of the array
        size++;
    }
    
    @Override
    public void remove(int i)
    {
        //Catches invalid indices
        if( i > size || i < 0)
        {
            throw new IndexOutOfBoundsException("That index is not valid. Pick an index within the list size");
        }
        
        Node temp = root;
        
        //Cycles through the list until it has reached the point of removal
        for (int count = 0; count < i; count++)
        {
            temp = temp.next;
        }
        
        //Sets the next value so that the node to be removed is no longer linked to by any node
        temp.next = (temp.next).next;
        
        //Decreases the size of the list
        size--;
    }
    
    @Override
    public double lookup(int i)
    {   
        //Catches invalid indices
        if (i < 0 || i > size)
        {
            throw new IndexOutOfBoundsException("That index is invalid. Please pick an index within the size of the list");
        }
        
        Node temp = root.next;
        
        //Cycles through the nodes of the list until it has reached the desired node
        for (int count = 0; count < i; count++)
        {
            temp = temp.next;
        }
        
        //Returns the desired node's value
        return temp.data;
    }
    
    @Override
    public void removeDuplicates()
    {
        Node temp = root;
        Node compare;
        
        //Nested for-loops cycle through every pair of nodes in the list, and removes a node if there is a duplicate
        for (int i = 0; i < size; i++)
        {
            //Iterates temp to the next node
            temp = temp.next;
            
            //Sets compare to temp so that the iteration of compare starts over
            compare = temp;
            
            for (int a = i+1; a < size; a++)
            {
                //Iterates compare
                compare = compare.next;
                
                if (compare.data == temp.data)
                {
                    remove(a);
                } 
            }
        }
    }
    
    @Override
    public void print()
    {
        Node temp = root.next;
        
        //Cycles through each node of the list and prints its value
        for(int i = 0; i < size; i++)
        {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }
}
