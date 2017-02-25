/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class ComissionCalculator {
    
    //instance variables 
    private String name;                    //sales person name
    private int totalSales;                 //total monthly sales
    private int yearsServ;                  //years of service with the company
    private int rank;                       //rank of Apprentice, Junior, or Senior
    private double salesComis;
    
    public ComissionCalculator(String name, int totalSales, int yearsServ, int rank){
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
    
    private void getRank()
    {
    if (rank == 1) 
    {
        System.out.println("Apprentice");
    } else if (rank == 2){
        System.out.println("Junior");
    }
    else 
        System.out.println("Senior");
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
        else if (totalSales > 400)
            
    }
    
}
