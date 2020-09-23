
package assignment9;


public class Inorder {
    public TreeNodes root;
    
    public Inorder(){
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
    
    public void inorder(){
        inorder(root);
    }
	    
    public void inorder(TreeNodes root){
        if(root != null){
            inorder(root.getLeft());
            System.out.print(root.getData() + " ");
            inorder(root.getRight());
        }
    }
}
