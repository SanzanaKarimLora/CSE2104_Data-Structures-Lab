
package assignment9;


public class Postorder {
    public TreeNodes root;
    
    public Postorder(){
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
    
    public void postorder(){
        postorder(root);
    }
	    
    public void postorder(TreeNodes root){
        if(root != null){
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }
}

