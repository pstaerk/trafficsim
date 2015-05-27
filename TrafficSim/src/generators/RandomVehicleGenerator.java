/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generators;

import ai.Driver;
import cars.Car;
import infrastructure.Line;
import java.util.Random;

/**
 *
 * @author schueler
 */
public class RandomVehicleGenerator
{    
    /**Generate any number of Cars with random parameters. Ugly code
     * 
     * @return arrayList<Car>
     */
    public Car generateCar (Car.CarData data, Line line, Driver.DriverData driverData)
    {
        //Generating speed variable
        Random rn = new Random();
        int n = data.maxMaxSpeed - data.minMaxSpeed + 1;
        int i = rn.nextInt() % n;
        int randMaxSpeed =  data.minMaxSpeed + i;
        
        //Generating acc variable
        Random rn2 = new Random();
        int n2 = data.maxMaxAcc - data.minMaxAcc + 1;
        int i2 = rn2.nextInt() % n;
        int randMaxAcc =  data.minMaxAcc + i;
        
        //Generating acc variable
        Random rn3 = new Random();
        int n3 = data.maxMaxDcc - data.minMaxDcc + 1;
        int i3 = rn3.nextInt() % n;
        int randMaxDcc =  data.minMaxDcc + i;
        
        Driver driver = generateDriver(driverData);
        
        return new Car(randMaxSpeed, randMaxAcc, randMaxDcc, line, driver, 0, 0, 0);
    }
    
    /**Generate random driver.
     * 
     * @return driver
     */
    public Driver generateDriver (Driver.DriverData data)
    {
        //Random AssholeIndex generator.
        Random rn = new Random();
        int n = data.maxAssholeInex - data.minAssholeIndex + 1;
        int i = rn.nextInt() % n;
        int randAssholeIndex =  data.minAssholeIndex + i;
        
        float randReactionTime = (float) Math.random();
        
        return new Driver(randAssholeIndex, randReactionTime);
    }
}
