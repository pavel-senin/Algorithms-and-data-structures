import java.util.*;
import java.lang.*;
public class Randoms {
    public static ArrayList<Integer> RandomFills(int NofElems){
        ArrayList<Integer> Filled = new ArrayList<>();
        for (; NofElems>0;NofElems--){
            Random rnd = new Random();
            Filled.add(rnd.nextInt(10));
        }
        System.out.println("Result: ");
        for (int i=0;i<Filled.size();i++) {
            System.out.print(Filled.get(i)+" ");
        }
        return Filled;
}
}
