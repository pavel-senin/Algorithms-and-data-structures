public class Main {
    public static void main(String[] args) {

        DLinkedList list = new DLinkedList();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.show();
        System.out.println();
        System.out.println(list.size());
        list.reverse();
        list.show();
    }
}