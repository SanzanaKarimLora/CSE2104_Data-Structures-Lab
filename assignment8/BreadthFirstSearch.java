
package assiignment8;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class BreadthFirstSearch{
    
    Scanner sc = new Scanner(System.in);
    Queue<Integer> q;
    public int node;
    public int edge;
    public int source;
    public int adj[][] = new int[100][100];
    public int WHITE = 1;
    public int GRAY = 2;
    public int BLACK = 3;
    public int color[] = new int[100];
    public int d[] = new int[100];
    public int pie[] = new int[100];
    public int element;
    
    public BreadthFirstSearch(){
    
        q = new LinkedList<Integer>();
    }
      public void enterNoOfNodes(){
        System.out.println("Enter the number of nodes : ");
        node = sc.nextInt();
    }
    
    public void enterNoOfEdges(){
        System.out.println("Enter the number of edges : ");
        edge = sc.nextInt();
    }
    
    public void enterGraph(){
        int n1, n2;
        for(int i = 0; i < edge; i++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            adj[n1][n2] = 1;
            adj[n2][n1] = 1;
        }
    }
    
    public void print(){
        for(int i = 0; i < node; i++){
            for(int j = 0; j < node; j++){
                System.out.print(adj[i][j]);
            }
            System.out.println();
        }
    }
    
    public void enterSource(){
        System.out.println("Enter the source : ");
        source = sc.nextInt();
    }
    
    public void BFS(int u){
        for(int i = 0; i < node && i != source; i++){
            color[i] = WHITE;
            d[u] = 20000000;
            pie[u] = -1;
        }
        
        color[source] = GRAY;
        d[source] = 0;
        pie[source] = -1;
        
        q.add(source);
        while(!q.isEmpty()){
           element = q.remove();
           System.out.print(element + "\t");
           for(int i = 0; i < element; i++){
                if(adj[element][i] == 1){
                    if(color[i] == WHITE){
                        color[i] = GRAY;
                        d[i] = d[element] + 1;
                        pie[i] = element;
                        q.add(i);
                    
                    }
                }
           }
           
           color[element] = BLACK;
        }   
    }
    
    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        
        bfs.enterNoOfNodes();
        bfs.enterNoOfEdges();
        bfs.enterGraph();
        bfs.print();
        bfs.BFS(3);
    }
}


