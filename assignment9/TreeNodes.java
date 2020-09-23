
package assignment9;


public class TreeNodes {
    int data;
    TreeNodes left;
    TreeNodes right;
    
    public TreeNodes(){
        data = 0;
        left = null;
        right = null;
    }
    
    public TreeNodes(int data){
        this.data = data;
        left = null;
        right = null;
    }

    public void setLeft(TreeNodes left) {
        this.left = left;
    }

    public void setRight(TreeNodes right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public TreeNodes getLeft() {
        return left;
    }

    public TreeNodes getRight() {
        return right;
    }
    
    public int getData() {
        return data;
    }
}
