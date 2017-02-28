
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
        String name;
        String rank;
        String input;
        
        //getting all the data from the user 
        name = JOptionPane.showInputDialog("Insert the sales associate name");
        
        input = JOptionPane.showInputDialog("Insert the amount of sales in a month");
        
        totalSales = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Insert the years of services");
        
        yearsService = Integer.parseInt(input);
        
        rank = JOptionPane.showInputDialog("Insert the rank");
        
        
       
        //creating the calculator
        CommisionCalculator myCalculator = new CommisionCalculator(input, totalSales, yearsService, rank);
       
       
        //calling the rank 
         myCalculator.setRank(rank);  
        
        
        
         System.out.println("The name of the sales person is " + name + 
              //   " \n\nThe total montly sales is: " + totalSales + " sales"
                   "\n\nThe amount of years with the company are: " + yearsService + " years"
                  + "\n\nThe rank is: " + myCalculator.getRank());       
         
         
          
        
        
        //computing all the commissions
         myCalculator.computeComission(totalSales);
        
        
        
    }
    
}
