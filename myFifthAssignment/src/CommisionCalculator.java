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
            
    public String getName()
    {
        return this.name;
    }
    
    public int getTotalSales()
    {
        return this.totalSales;
    }
    
    public int getYearsServ()
    {
        return this.yearsServ;
    }
    
    
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
                rankType = "ERROR";
                break;
        }
    }
    
    public String getRank()
    {
        return rankType;
    }
    
    public void computeComission()
    {
        if (totalSales > 100)
        {
            salesComis = 0.01;
        }
        else if (totalSales > 200)
        {
            salesComis = 0.015;
        }
        else if (totalSales > 400) {
            
        }      
    }

    
}
