/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_MiniDuckSimulator;

/**
 *
 * @author dean
 */
public class FlyNoWay implements FlyBehaviour
{

    @Override
    public void fly()
    {
        System.out.println("I can't fly!");
    }
    
}
