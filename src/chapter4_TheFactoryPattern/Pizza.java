/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_TheFactoryPattern;

/**
 *
 * @author dean
 */
abstract class Pizza {

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
    
}
