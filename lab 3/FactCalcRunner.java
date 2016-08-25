
/**
 * @Laurel Woods 
 */
public class FactCalcRunner
{
    public static void main (String[] args){
        int n = 6;
        
        FactCalc fc = new FactCalc();
        System.out.println ("Number: " + n);
        System.out.println("Factorial of " + n + ": " + fc.factorial(n));
        
    }
}
