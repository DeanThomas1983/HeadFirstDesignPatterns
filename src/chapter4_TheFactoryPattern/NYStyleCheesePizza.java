/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_TheFactoryPattern;

/**
 *
 * @author dean
 */
class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style sauce and Cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";
        
        toppings.add("Grated Reggiano Cheese");
    }
    
}
