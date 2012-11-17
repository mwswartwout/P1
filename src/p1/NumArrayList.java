package p1;

public class NumArrayList implements NumList
{
    private int size;
    private double[] entries;

    //NumArrayList Constructor
    public void NumArrayList()
    {
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
        //Index must be greater than 0 or it is not valid
        if(i < 0)
        {
            throw new IndexOutOfBoundsException("Index is not valid. Please Enter a positive index.");
        }
        
        //If the index is greater than the size of the list then the value is added onto the end of the list
        if (i > size+1)
        {
            i = size;
        }
        
        size++;
        
        //Temp holds all of the entries from the all numArrayList before the point of insertion
        double[] temp = new double[size];
                
        for (int a = 0; a < i; a++)
        {
            temp[a] = entries[a];
        }
        
        //Then temp adds the new entry into the designated spot
        temp[i] = value; 
        
        //Finall temp adds the remaining values from the original numArrayList
        for (int b = i+1; b < size; b++)
        {
            temp[b] = entries[b-1];
        }
        
        //And is saved as the entries array
        entries = temp;
    }
    
    @Override
    public void remove(int i)
    {
        //Catches invalid indices
        if (i > size-1 || i < 0) 
        {
            throw new IndexOutOfBoundsException("The specified index does not exist");
        }
        
        else
        {
            //Reduce the size of the array
            size--;
            
            //Temp will hold all of the array values except for the designated value
            double[] temp = new double[size];
        
            //Adds all values from original array before the specified index into temp
            for (int a = 0; a < i; a++)
            {
                temp[a] = entries[a];
            }
        
            //Skips over the index specified to be removed and fills out the rest of the original values
            for (int b = i; b < size; b++)
            {
                temp[b] = entries[b+1];
            }
        
            //Saves the temp array as entries
            entries = temp;
        }
    }
    
    @Override
    public double lookup(int i)
    {
        //Catches invalid indices
        if (i > size+1 || size == 0)
        {
            throw new ArrayIndexOutOfBoundsException("That index does not exists");
        }
        
       //Returns the designated value
       return entries[i];
    }
    
    @Override
    public void removeDuplicates()
    {
        //Nested for-loops compare every pair within the array and remove the value if it is a duplicate
        for (int i = 0; i < size; i++)
        {
            for (int a = i+1; a < size; a++)
            {
                if (entries[i] == entries[a])
                {
                    remove(a);
                }
            }
        }
    }
    
    @Override
    public void print()
    {
        //Catches invalid indices
        if (size == 0) 
        {
            System.out.println("No entries in the Array List");
        }
        
        //Prints each entry in the numArrayList
        for (int i = 0; i < size; i++) 
        {
            System.out.println(entries[i] +" ");
        }
    }
}
