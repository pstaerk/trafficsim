/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

/**This class is the representation of a traffic light. You can turn it on and off.
 *
 * @author schueler
 */
public class TrafficLight
{
    boolean isOn;

    /**Intitialize TrafficLight with start phase.
     * 
     * @param isOn 
     */
    public TrafficLight(boolean isOn)
    {
        this.isOn = isOn;
    }

    /**Get the current phase of the traffic light.
     * 
     * @return phase
     */
    public boolean getLight()
    {
        return isOn;
    }

    /**Set the phase of the traffic Light
     * 
     * @param setPhase
     */
    public void setLight(boolean isOn)
    {
        this.isOn = isOn;
    }
    
    
}
