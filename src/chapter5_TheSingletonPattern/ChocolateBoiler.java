/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5_TheSingletonPattern;

/**
 *
 * @author dean
 */
public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;
    
    public static ChocolateBoiler getInstance()
    {
        if (uniqueInstance == null) 
        {
            uniqueInstance= new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    
    private ChocolateBoiler()
    {
        empty = false;
        boiled = false;
    }
    
    public void fill()
    {
        if (empty)
        {
            empty = false;
            boiled = false;
        }
    }
    
    public void drain()
    {
        if (!empty && boiled)
        {
            empty = true;
        }
    }
    
    public void boil()
    {
        if (!empty && !boiled)
        {
            boiled = true;
        }
    }
    
    public boolean isEmpty()
    {
        return empty;
    }
    
    public boolean isBoiled()
    {
        return boiled;
    }
}
