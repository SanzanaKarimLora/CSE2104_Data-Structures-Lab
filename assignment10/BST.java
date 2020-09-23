
package assignment10;


public class BST {
    public TreeNodes root;
    
    public BST(){
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
    
    public boolean search(int val) {
         return search(root, val);
    }
    
    public boolean search(TreeNodes r, int val){
         if (r.getData() == val)
             return true;
         if (r.getLeft() != null)
             if (search(r.getLeft(), val))
                 return true;
         if (r.getRight() != null)
             if (search(r.getRight(), val))
                 return true;
         return false;         
    }
    
}
