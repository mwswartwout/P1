
package p1;

public interface NumList 
{
    //Provides the interface for each method that NumArrayList and NumLinkedList use
    int size();
    
    void insert(int i, double value);
    
    void remove(int i);
    
    double lookup(int i);
    
    void removeDuplicates();
    
    void print();
}
