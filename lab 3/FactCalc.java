
/**
 * @Laurel Woods
 */
public class FactCalc
{
    // instance variables - replace the example below with your own
    private int result;
    
    public FactCalc() 
    {
        result = 0;
    }   
    
    public int factorial (int n) {
        result = 1;
        while (n > 0) {
            result = result * n;
            n = n - 1;
        
         }   
        return result;
    }
}