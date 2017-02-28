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
    }
            
    //setting the rank 
    public void setRank(String input)
    {
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
        double comission = 0;
        
        if (totalSales > 400000)
        {
            salesComis = 0.02;
            comission =  salesComis * 0.02;
        }
        else if (totalSales > 300000 )
        {
            salesComis = 0.0175;
            comission =  salesComis * 0.0175;
        }
        else if (totalSales > 200000) {
            salesComis = 0.015;
            comission =  salesComis * 0.015;
        }      
        else if (totalSales >= 100000)
        {
            salesComis = 0.01;
            comission =  salesComis * 0.01;
        }
        else
        {
            salesComis = 0;
        }
        
        System.out.println("The comission assigned is " + salesComis);
        System.out.println("The commission is " + comission);
    }
    

    
    
    public double getComission()
    {
        return salesComis;
        
    }
    
}
