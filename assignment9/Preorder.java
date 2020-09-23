
package assignment9;

public class Preorder {
    
    public TreeNodes root;
    
    public Preorder(){
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void insert(int data){
         root = insert(root, data);
    }
	    
    public TreeNodes insert(TreeNodes node, int data){
        if(node == null){
            node = new TreeNodes(data);
        }
        else{
            if(data <= node.getData()){
                node.left = insert(node.left, data);
            }
            else{
                node.right = insert(node.right, data);
            }
        }
        return node;
    }
    
    public void preorder(){
        preorder(root);
    }
	    
    public void preorder(TreeNodes root){
        if(root != null){
            System.out.print(root.getData() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
}

