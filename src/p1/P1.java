package p1;

public class P1 
{
    public static void main(String[] args) 
    {
        //Test code for NumArrayLists, NumLinkedLists, and NumSets
        
        //Comments can be removed to test NumArrayLists, NumLinkedLists, or NumSets
        NumArrayList List = new NumArrayList();
        //NumLinkedList List = new NumLinkedList();
        //double[] array1 = new double[0];
        //double[] array2 = new double[0];
        //NumSet List = new NumSet(array1);
        //NumSet List2 = new NumSet(array2);
        
        //Confirms that List was initialized and is size 0
        System.out.println(List.size());
        
        //Comment can be removed to test the exception handling of insert
        //List.insert(-1, 1);
        
        //Tests the insert function on an empty list
        List.insert(0, 1);
        List.print();
        System.out.println();
        
        //Test the insert funciton when the index entered is larger than the list
        List.insert(5, 2);
        List.print();
        System.out.println();
        
        //Test the insert function when inserting into the middle of an list
        List.insert(1, 3);
        List.insert(2, 4);
        List.insert(3, 6);
        List.insert(4, 6);
        List.insert(5, 3);
        List.print();
        System.out.println();
        
        //Comment can be removed to test exception handling of lookup
        //System.out.println(List.lookup(25));
        
        //Tests lookup function at beginning of the list
        System.out.println(List.lookup(0));
        System.out.println();
        
        //Tests the lookup function at the end of the list
        System.out.println(List.lookup(List.size()-1));
        System.out.println();
        
        //Test duplicate removal from the list
        List.removeDuplicates();
        List.print();
        System.out.println();
        
        //Comment can be removed to test exception handling of remove
        //List.remove(27);
        
        //Test the remove function at the beginning of the list
        List.remove(0);
        List.print();
        System.out.println();
        
        //Tests the remove function at the end of the list
        List.remove(List.size()-1);
        List.print();
        System.out.println();
        
        //Test the remove function in the middle of the list
        List.remove(1);
        List.print();
        System.out.println();
        
        
         //These comments can be removed to create List2 for the testing of union and intersect
         //List2.insert(0, 1);
         //List2.insert(1, 2);
         //List2.insert(2, 7);
         //List2.insert(3, 8);
         //List2.insert(4, 6);
         
        //Tests the union function of numSet
        //NumSet List3 = NumSet.union(List, List2);
        //List3.print();
        //System.out.println();
        
        //Tests the intersection function of numSet
        //NumSet List4 = NumSet.intersect(List, List2);
        //List4.print();
        //System.out.println();
    }
}
