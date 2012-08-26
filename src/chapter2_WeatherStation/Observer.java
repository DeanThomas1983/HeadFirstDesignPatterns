/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2_WeatherStation;

/**
 *
 * @author dean
 */
public interface Observer
{
    public void update(float temperature, 
                       float humidity,
                       float pressure);
}
