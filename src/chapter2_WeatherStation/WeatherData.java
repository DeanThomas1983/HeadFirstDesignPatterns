/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2_WeatherStation;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author dean
 */
public class WeatherData extends Observable
implements Subject
{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() 
    {
        
    }
   
    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }
    
    public void setMeasurements(float temperature,
                                float humidity,
                                float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        
        measurementsChanged();
    }

    float getTemperature()
    {
        return temperature;
    }

    float getHumidity()
    {
        return humidity;
    }

    float getPressure()
    {
        return pressure;
    }
}
