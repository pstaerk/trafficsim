/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.awt.Point;
import java.util.ArrayList;
import vehicles.Car;

/**
 *
 * @author schueler
 */
public class Line
{
    private ArrayList<Line> prvLines;
    private ArrayList<Line> nxtLines;
    private Line leftLine;
    private Line rightLine;
    
    private ArrayList<Point> points;
    
    private int speedLimitCar;
    private int speedLimitTruck;
    
    private ArrayList<Car> cars;
    
    private int length;

    public Line()
    {
        prvLines = new ArrayList();
        nxtLines = new ArrayList();
        points = new ArrayList();
        cars = new ArrayList();
    }
    
}
