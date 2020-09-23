
package assiignment8;


import java.util.Scanner;

public class DFS{
    Scanner sc = new Scanner(System.in);
    
    public int node;
    public int edge;
    public int adj[][] = new int[100][100];
    public int WHITE = 1;
    public int GRAY = 2;
    public int BLACK = 3;
    public int color[] = new int[100];
    public int d[] = new int[100];
    public int f[] = new int[100];
    public int pie[] = new int[100];
    public int time;
    
    public DFS(){
        node = 0;
        edge = 0;
        time = 0;
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
    
    public void dfs(){
        for(int i = 0; i < node; i++){
            color[i] = WHITE;
            pie[i] = -1;
        }
        
        time = 0;
        
        for(int i = 0; i < node; i++){
            if(color[i] == WHITE){
                dfs_Visit(i);
            }
        }
    }
    
    public void dfs_Visit(int x){
        time = time + 1;
        color[x] = GRAY;
        d[x] = time;
        for(int i = 0; i < node; i++){
            if(adj[x][i] == 1){
                if(color[i] == WHITE){
                    pie[i] = x;
                    dfs_Visit(i);
                }
            }
        }
        color[x] = BLACK;
        time = time + 1;
        f[x] = time;
        
        System.out.println("DFS is : ");
        for(int i = 0; i < node; i++){
            System.out.print(d[i] + " ");
            System.out.println("");
        }
    }
        
    
    public static void main(String[] args) {
        DFS d = new DFS();
        d.enterNoOfNodes();
        d.enterNoOfEdges();
        d.enterGraph();
        d.print();
        d.dfs();
    }
}
    