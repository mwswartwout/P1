package p1;

public class NumSet extends NumArrayList
{
    
    //NumSet Constructor   
    public NumSet(double[] array)
    {
        //Because NumSet extends NumArrayList the constructor creates a NumArrayList with all of the values from the parameter array
          for(int i = 0; i < array.length; i++)
          {
              insert(i, array[i]);
          }
    }
    
    //A set intersection contains one of every value that two sets have in common
    public static NumSet intersect(NumSet s1, NumSet s2)
    {
        double[] array = new double[0];
        NumSet newSet = new NumSet(array);
        
        //Removing duplicates in the beginning prevents unecessary comparisons later on
        s1.removeDuplicates();
        s2.removeDuplicates();

        //Nested for loops compare every pair of items in the two lists and insert any items in common into the new list
        for(int i = 0; i < s1.size(); i++)
        {
            for(int a = 0; a < s2.size(); a++)
            {
                if (s1.lookup(i) == s2.lookup(a))
                {
                    newSet.insert(newSet.size(), s1.lookup(i));
                }
            }
        }

        return newSet;
    }
    
    //A set union contains every element that the two distinct sets contain, with no duplicates
    public static NumSet union(NumList s1, NumList s2)
    {
        double[] array = new double[0];
        NumSet newSet = new NumSet(array);
        
        //Removing duplicates prevents unecessary additions later
        s1.removeDuplicates();
        s2.removeDuplicates();
        
        //For loops add ever element in each array to the new array
        for(int i = 0; i <s1.size(); i++)
        {
            newSet.insert(i, s1.lookup(i));
        }
        
        for(int a = 0; a < s2.size(); a++)
        {
            newSet.insert(a, s2.lookup(a));
        }
        
        //And then remove duplicates from the new array
        newSet.removeDuplicates();
        
        return newSet;
    }
    
    //Print functionality is exactly the same as the in NumArrayList and is therefore not necessary to include in this class
}
