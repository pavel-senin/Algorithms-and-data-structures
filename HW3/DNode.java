public class DNode {
    private int value;
    private DNode left;
    private DNode right;
    public DNode(){
        this.value = 0;
        this.left=null;
        this.right=null;
    }
    public void setDNodeValue(int value){
        this.value=value;
    }
    public void setDNodeRight(DNode right){
        this.right=right;
    }
    public void setDNodeLeft(DNode left){
        this.left=left;
    }
    public int getDNodeValue(){
        return this.value;
    }
    public DNode getDNodeRight(){
        return this.right;
    }
    public DNode getDNodeLeft(){
        return this.left;
    }
}
