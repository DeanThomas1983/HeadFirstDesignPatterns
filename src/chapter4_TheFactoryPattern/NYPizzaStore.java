/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_TheFactoryPattern;

/**
 *
 * @author dean
 */
public class NYPizzaStore extends PizzaStore 
{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese"))
        {
            return new NYStyleCheesePizza();
        }
        else if (type.equals("pepperoni"))
        {
            return new NYStylePepperoniPizza();
        }
        else if (type.equals("clam"))
        {
            return new NYStyleClamPizza();
        }
        else if (type.equals("veggie"))
        {
            return new NYStyleVeggiePizza();
        }
        else 
        {
            return null;
        }
    }
    
}
