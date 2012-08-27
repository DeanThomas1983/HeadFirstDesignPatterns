/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_TheFactoryPattern;

/**
 *
 * @author dean
 */
public class ChicagoStyleCheesePizza extends Pizza
{
    public ChicagoStyleCheesePizza()
    {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
        
        toppings.add("Shredded Mozzarella Cheese");
    }
    
    @Override
    void cut()
    {
        System.out.println("Cutting into square slices");
    }
}
