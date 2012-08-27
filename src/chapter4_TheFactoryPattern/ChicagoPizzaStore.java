/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_TheFactoryPattern;

/**
 *
 * @author dean
 */
class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese"))
        {
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("pepperoni"))
        {
            return new ChicagoStylePepperoniPizza();
        }
        else if (type.equals("clam"))
        {
            return new ChicagoStyleClamPizza();
        }
        else if (type.equals("veggie"))
        {
            return new ChicagoStyleVeggiePizza();
        }
        else 
        {
            return null;
        }
    }
    
}
