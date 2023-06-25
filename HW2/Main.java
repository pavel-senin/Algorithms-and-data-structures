import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Randoms RMS = new Randoms();
        HeapSort HPS = new HeapSort();
        ArrayList<Integer> A = new ArrayList<>();
        A = Randoms.RandomFills(10);
        A = HPS.sort(A);
        System.out.println("After sorting:");
        for (int i=0;i<A.size();i++) {
            System.out.print(A.get(i)+" ");
        }
    }
}