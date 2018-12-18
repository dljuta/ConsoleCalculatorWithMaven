package ch.bbw.dl.ConsoleCalculatorWithMaven;

/**
 * @author Dorian Ljuta
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        
        int valueA = 12;
        int valueB = 8;
        
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println(valueA + "/" + valueB + "= " + calculator.Summe(valueA, valueB) );
        System.out.println("");
        
        System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.out.println(valueA + "-" + valueB + "= " + calculator.subtraction(valueA, valueB) );
    	System.out.println("");
    	
    	System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.out.println(valueA + "*" + valueB + "= " + calculator.multiplikation(valueA, valueB) );;
    	System.out.println("");
    	
    	System.out.println("Console Calculator");
    	System.out.println("==================");
    	System.out.println(valueA + "/" + valueB + "= " + calculator.division(valueA, valueB) );
    	System.out.println("");
       
    }
}
