package p1;

public class TestProblem 
{
    public static void main(String[] args) 
    {
        //Farmer Lewicki keeps horses and chickens on his farm
        //Because his horses each stay in a specific stall he uses a NumSet to keep track of them
        
        double[] horse = new double[0];
        NumSet horses = new NumSet(horse);
        
        //His chickens all stay in the same coop, in no specific order, so he keeps them in a NumLinkedList
        
        NumLinkedList chickens = new NumLinkedList();
        
        //Whenever he buys new horses or chickens he can insert them into his lists, keeping track of how much he paid for them
        
        horses.insert(0, 1500);
        horses.insert(1, 2000);
        horses.insert(2,3000);
        
        chickens.insert(0,10);
        chickens.insert(1,25);
        chickens.insert(2, 30);
        
        //When he kills a chicken he removes it from his list
        
        chickens.remove(0);
        
        //When Farmer Lewicki is away he can lookup what horse is in each stall
        
        horses.lookup(1);
        
        //Farmer Lewicki knows that he bought horses 1,2 and 3 in May and 4,5, and 6 in June
        //and he needs to create a full list of purchases for those two months, so he uses the 
        //union function of his sales data
        
        double[] may = {1000,2500,3000};
        double[] june = {4250,5500,6790};
        
        NumSet mayHorses = new NumSet(may);
        NumSet juneHorses = new NumSet(june);
        
        horses = NumSet.union(mayHorses, juneHorses);
        
        //And then he can easily print his livestock inventory along with the price he paid for each
        horses.print();
        System.out.println();
        chickens.print();
        
    }
}
