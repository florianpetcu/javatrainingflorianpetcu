/*
 * Replace the no.
 */
package replace.no.k;

/**
 *Replace the no.
 * @author asus
 */
public class ReplaceNoK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first = 7;
        int second = 19;
        int third;
        third = second;
        second = first;
        first = third;
        System.out.println("first=" + first + " second=" + second);
    }
    
}
