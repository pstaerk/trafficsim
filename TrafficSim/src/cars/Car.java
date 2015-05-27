/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import infrastructure.Line;
import ai.Driver;

/**
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
    
    public class CarData
    {
        public int maxMaxSpeed;
        public int minMaxSpeed;
        
        public int maxMaxAcc;
        public int minMaxAcc;
        
        public int maxMaxDcc;
        public int minMaxDcc;

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
