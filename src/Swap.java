
public class Swap{
  public static void main(String[] args){
    int i = 10;
    int j = 7;
    int k = i;
    i = j; 
    j = k;
    System.out.println(i);
    System.out.println(j);
    // Expected Result , i = 7  and j = 10    
   }
}