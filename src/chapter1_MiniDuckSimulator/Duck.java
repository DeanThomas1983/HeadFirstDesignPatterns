/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_MiniDuckSimulator;

/**
 *
 * @author dean
 */
public abstract class Duck
{
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    
    public Duck()
    {
        
    }
    
    public abstract void display();
    
    public void performFly()
    {
        flyBehaviour.fly();
    }
    
    public void performQuack()
    {
        quackBehaviour.quack();
    }
    
    public void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }
}
