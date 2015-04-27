/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

/**
 *
 * @author schueler
 */
public class Driver
{
    private int assholeIndex;
    private float reactionTime;
    
    
    
    

    public class DriverData
    {
        public int maxAssholeInex;
        public int minAssholeIndex;
        
        public float maxReactionTime;
        public float minReactionTime;

        /**Set parameters for random generation of Drivers.
         * 
         * @param maxAssholeInex
         * @param minAssholeIndex
         * @param maxReactionTime
         * @param minReactionTime 
         */
        public DriverData(int maxAssholeInex, int minAssholeIndex, float maxReactionTime, float minReactionTime)
        {
            this.maxAssholeInex = maxAssholeInex;
            this.minAssholeIndex = minAssholeIndex;
            this.maxReactionTime = maxReactionTime;
            this.minReactionTime = minReactionTime;
        }
    }
}
