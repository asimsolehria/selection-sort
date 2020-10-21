
package selectionsort;

/**
 *
 * @author asim
 */
public class main {
    
    public static void main(String[] args) {
        
        int [] array={8,2,6,9,4,3,5,7,1};
        
        SelectionSort sort=new SelectionSort();
        
        sort.sort(array);
        
        for (int i : array) {
            System.out.println(i);
        }
    }

}
