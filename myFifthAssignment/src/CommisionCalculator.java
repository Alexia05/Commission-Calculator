/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class CommisionCalculator {
    
    //instance variables 
    private String name;                    //sales person name
    private int totalSales;                 //total monthly sales
    private int yearsServ;                  //years of service with the company
    private String rank;                       //rank of Apprentice, Junior, or Senior
    private String rankType;
    private double salesComis;
    
    
    public CommisionCalculator(String name, int totalSales, int yearsServ, String rank){
        this.name = name;
        this.totalSales = totalSales;
        this.yearsServ = yearsServ;
        this.rank = rank;
       // System.out.printf("The total monthly sales is: $%7.2f", totalSales) ;
        
    }
            
    
     //setting the rank 
    public void setRank(String input)
    {
        double rankInc = 0;
        switch(input)
        {
            case "1": 
                rankType = "Apprentice";
                break;
            case "2":
                rankType = "Junior";
                break;
            case "3":
                rankType = "Senior";
                break;
            default:
                rankType = "ERROR, you have to select from 1 to 3";
                break;
        }
     
    }
    
    public String getRank()
    {
        return rankType;
    }
    
    //making ll the calculations 
    public void computeComission(double totalSales)
    {
        double comiss = 0;
        if (totalSales > 400000)
        {
            salesComis = 0.02;
            comiss =  salesComis * 0.02;
        }
        else if (totalSales > 300000 )
        {
            salesComis = 0.0175;
            comiss =  salesComis * 0.0175;
        }
        else if (totalSales > 200000) {
            salesComis = 0.015;
            comiss =  salesComis * 0.015;
        }      
        else if (totalSales >= 100000)
        {
            salesComis = 0.01;
            comiss =  salesComis * 0.01;
        }
        else
        {
            System.out.println("\nLo siento, you haven't satisfied the sales goal" 
                    + "so you don't have any commission");
        }
        
        System.out.println("\nThe commission assigned per sales is: " + salesComis);
        System.out.println("\nThe commission is: " + comiss);
        
        //commission regarding to years with the company
        double yearComiss;
        if (yearsServ > 10)
        {
            yearComiss = 0.01 * totalSales * yearsServ; 
        }
        else 
        {
            yearComiss = 0.01 * 0.1 * totalSales * yearsServ; 
        }
        
       
        System.out.println("\nAccording to the years with the company you also have "
                             + yearComiss + " additional commission");
        
        //according to the rank
        double rankInc = 0;
        switch(rank)
        {
            case "1": 
                System.out.println("\nSorry, you don't receive rank incentive");
                break;
            case "2":
                rankInc = 0.001 * totalSales;
                System.out.println("\nYour incentive according to the rank is: "
                            + rankInc);
                break;
            case "3":
                rankInc = 0.002 * totalSales;
                System.out.println("\nYour incentive according to the rank is: "
                            + rankInc);
                break;
            default:
                rankType = "\nERROR, you have to select from 1 to 3";
                break;
        }
        
        
    }
    

    
    
    
    
}
