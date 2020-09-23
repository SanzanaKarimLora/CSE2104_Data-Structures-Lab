import java.util.Scanner;
import java.util.Random;

public class LinearSearch{
    public int element;
    public int ar1[] = new int[1000];
    public int ar2[] = new int[1000];
    
    public LinearSearch(){
        this.element = 0;
        
    }
    
    public void randomNumber(){
      Random rn = new Random();
      for(int i = 0; i < ar1.length; i++){
            ar1[i] = rn.nextInt();
            System.out.println(ar1[i]);
        }
    }
    
    public void enterElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which you want to search: ");
        element = sc.nextInt();
    }
   
    public void linearSearch()
{
    int flag, i, j;
    flag = -1;
    for(i = 0, j = 0; i < ar1.length; i++)
    {
        if(ar1[i] == element)
        {
            ar2[j] = i;
            flag = 1;
            j++;
        }
    }

    if(flag == -1)
        System.out.println(element + " is not found in this array." );
    else
    {
        System.out.println(element + " is found in the following location(s).");
        for(i = 0; i < j; i++){
            System.out.println(ar2[i] + " ");
        }
    }
}
   
}