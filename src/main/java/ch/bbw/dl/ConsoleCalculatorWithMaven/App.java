package ch.bbw.dl.ConsoleCalculatorWithMaven;

/**
 * Hello world!
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
        System.out.println("-------------------");
        System.out.println("");
        System.out.println(calculator.Summe(valueA, valueB));
        
        System.out.println("Console Calculator");
    	System.out.println("==================");
        System.out.println("");
    	System.out.println(calculator.subtraction(valueA, valueB));
        
       
    }
}
