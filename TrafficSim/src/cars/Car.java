/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import ai.Driver;
import infrastructure.Line;

/**
 *
 * @author schueler
 */
public class Car
{
    public final int MAX_SPEED;
    public final int MAX_ACCL;
    public final int MAX_DCCL;
    public final int CAR_LENGTH;
    
    private Line line;
    private Driver driver;
    private float x;
    private float curVelocity;
    private float curAcceleration;

    public Car(int MAX_SPEED , int MAX_ACCL , int MAX_DCCL , int CAR_LENGTH , Line line , Driver driver , float x , float curVelocity , float curAcceleration)
    {
        this.MAX_SPEED = MAX_SPEED;
        this.MAX_ACCL = MAX_ACCL;
        this.MAX_DCCL = MAX_DCCL;
        this.CAR_LENGTH = CAR_LENGTH;
        this.line = line;
        this.driver = driver;
        this.x = x;
        this.curVelocity = curVelocity;
        this.curAcceleration = curAcceleration;
    }
    
    
}
