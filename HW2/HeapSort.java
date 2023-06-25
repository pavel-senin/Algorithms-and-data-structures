import java.util.*;
import java.lang.*;
public class HeapSort
{
    public ArrayList<Integer> sort(ArrayList<Integer> arr)
    {
        int n = arr.size();

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            Integer temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);
            heapify(arr, i, 0);
        }
        return arr;
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
    void heapify(ArrayList<Integer> arr, int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr.get(l) > arr.get(largest))
            largest = l;

        if (r < n && arr.get(r) > arr.get(largest))
            largest = r;
        if (largest != i)
        {
            int swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest,swap);

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

}