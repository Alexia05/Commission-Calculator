
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class CommisionCalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int totalSales;
        int yearsService;
        int rank;
        String input;
        
        //getting all the data from the user 
        input = JOptionPane.showInputDialog("Insert the sales associate name");

        String name = input;
        
        input = JOptionPane.showInputDialog("Insert the amount of sales in a month");
        
        totalSales = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Insert the years of services");
        
        yearsService = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Insert the rank");
        
        rank = Integer.parseInt(input);
        
        
        //creating the calculator
        CommisionCalculator myCalculator = new CommisionCalculator(input, totalSales, yearsService, rank );
       
         System.out.println("The name of the sales person is " + name + " the total montly sales is " + totalSales
                        + " the amount of years served are " + yearsService + " and the rank is " + rank);       
                
        
        
       
        
        
    }
    
}
