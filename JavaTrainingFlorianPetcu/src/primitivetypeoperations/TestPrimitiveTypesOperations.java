/*
 * testing primitive types operations
 */
package primitivetypeoperations;

/**
 * Testing primitive types operations.
 * @author asus
 */
public class TestPrimitiveTypesOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short s1 = 22;
        short s2,s3;
        int i1 = 310;
        int i2,i3;
        long l1 = 20400;
        long l2,l3;
        float f1 = 2.3f;
        float f2,f3;
        double d1 = -310.28;
        double d2,d3;
        
        s3 = (short)i1;
        i2 = s1+s3;
        
        i3 = (short)l1;
        l2 = i1+i3;
        
        l3 = (short)f1;
        f2 = l1+l3;
        
        f3 = (short)d1;
        f2 = f1+f3;
        
        d2 = -245.30;
        d3 = d1+d2;
                
    }
    
}
