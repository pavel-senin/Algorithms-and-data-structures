public class DLinkedList {
    public DNode head;
    public DNode current;

    public DLinkedList() {
        DNode head = new DNode();
        this.head = head;
        this.current = head;
    }

    public void add(int value) {
        while (this.current.getDNodeRight() != null) {
            this.current = this.current.getDNodeRight();
        }
        DNode node = new DNode();
        node.setDNodeValue(value);
        node.setDNodeLeft(this.current);
        this.current.setDNodeRight(node);
        this.current = this.head;
    }

    public void show() {
        System.out.println("DLinkedList:");
        this.current = this.head.getDNodeRight();
        while (this.current.getDNodeRight() != null) {
            System.out.print(this.current.getDNodeValue() + " ");
            this.current = this.current.getDNodeRight();
        }
        System.out.print(this.current.getDNodeValue() + " ");
        this.current = this.head;
    }

    public int size() {
        if (this.head.getDNodeRight() == null) {
            return 0;
        } else {
            this.current = this.head;
            int counter = 0;
            while (this.current.getDNodeRight() != null) {
                counter++;
                this.current = this.current.getDNodeRight();
            }
            return counter;
        }

    }

    public void reverse() {
        if (this.size() > 0) {
            this.current = this.head.getDNodeRight();

            for (int i=0; this.current.getDNodeRight() != null; i++) {
                if (i!=0) {
                    DNode swapleft;
                    DNode swapright;
                    swapleft = this.current.getDNodeLeft();
                    swapright = this.current.getDNodeRight();

                    this.current.setDNodeRight(swapleft);
                    this.current.setDNodeLeft(swapright);

                    this.current = this.current.getDNodeLeft();
                } else{
                    this.current.setDNodeLeft(this.current.getDNodeRight());
                    this.current.setDNodeRight(null);

                    this.current = this.current.getDNodeLeft();
                }
                System.out.println(i +"th: "+this.current.getDNodeValue() );
            }
            this.current.setDNodeRight(this.current.getDNodeLeft());
            this.current.setDNodeLeft(this.head);
            this.head.setDNodeRight(this.current);
        } else{
            System.out.println("Empty list");
        }
    }
}
