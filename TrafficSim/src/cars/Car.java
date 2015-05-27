/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import infrastructure.Line;
import ai.Driver;

/**This class is a representation of a car.
 *
 * @author schueler
 */
public class Car
{
    public final int MAX_SPEED;
    public final int MAX_ACCL;
    public final int MAX_DCCL;
    
    private Line line;
    private Driver driver;
    private float x;
    private float curVelocity;
    private float curAcceleration;

    /**Generate a car. For easy use, use RandomVehicleGenerator and CarData.
     * 
     * @param MAX_SPEED
     * @param MAX_ACCL
     * @param MAX_DCCL
     * @param line
     * @param driver
     * @param x
     * @param curVelocity
     * @param curAcceleration 
     */
    public Car(int MAX_SPEED , int MAX_ACCL , int MAX_DCCL , Line line , Driver driver , float x , float curVelocity , float curAcceleration)
    {
        this.MAX_SPEED = MAX_SPEED;
        this.MAX_ACCL = MAX_ACCL;
        this.MAX_DCCL = MAX_DCCL;
        this.line = line;
        this.driver = driver;
        this.x = x;
        this.curVelocity = curVelocity;
        this.curAcceleration = curAcceleration;
    }
   
    /**CarData contains boundaries for randomly generating a Car.
     * 
     */
    public class CarData
    {
        public int maxMaxSpeed;
        public int minMaxSpeed;
        
        public int maxMaxAcc;
        public int minMaxAcc;
        
        public int maxMaxDcc;
        public int minMaxDcc;

        /**Set boundaries for random generation of cars.
         * 
         * @param maxMaxSpeed
         * @param minMaxSpeed
         * @param maxMaxAcc
         * @param minMaxAcc
         * @param maxMaxDcc
         * @param minMaxDcc 
         */
        public CarData(int maxMaxSpeed, int minMaxSpeed, int maxMaxAcc, int minMaxAcc, int maxMaxDcc, int minMaxDcc)
        {
            this.maxMaxSpeed = maxMaxSpeed;
            this.minMaxSpeed = minMaxSpeed;
            this.maxMaxAcc = maxMaxAcc;
            this.minMaxAcc = minMaxAcc;
            this.maxMaxDcc = maxMaxDcc;
            this.minMaxDcc = minMaxDcc;
        } 
    }
    
    
}
