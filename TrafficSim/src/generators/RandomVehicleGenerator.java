/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generators;

import ai.Driver;
import infrastructure.Line;
import java.util.Random;
import vehicles.Car;

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
        int n = data.averageMaxSpeed - data.maxSpeedRange + 1;
        int i = rn.nextInt() % n;
        int randMaxSpeed =  data.maxSpeedRange + i;
        
        //Generating acc variable
        Random rn2 = new Random();
        int n2 = data.averageMaxAcc - data.maxAccRange + 1;
        int i2 = rn2.nextInt() % n;
        int randMaxAcc =  data.maxAccRange + i;
        
        //Generating acc variable
        Random rn3 = new Random();
        int n3 = data.averageMaxDcc - data.maxDccRange + 1;
        int i3 = rn3.nextInt() % n;
        int randMaxDcc =  data.maxDccRange + i;
        
        Driver driver = generateDriver(driverData);
        
        return new Car(randMaxSpeed, randMaxAcc, randMaxDcc, line, driver, 0, 0, 0);
    }
    
    /**Generate random driver.
     * 
     * @return driver
     */
    public Driver generateDriver (Driver.DriverData data)
    {
        
        
        return null;
    }
}
