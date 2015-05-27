/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import cars.Car;
import java.awt.Point;
import java.util.ArrayList;
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

    public Line()
    {
        prvLines = new ArrayList();
        nxtLines = new ArrayList();
        points = new ArrayList();
        cars = new ArrayList();
    }
    
}
