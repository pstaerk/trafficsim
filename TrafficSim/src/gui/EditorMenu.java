/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.elements.Drawable;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

/**
 *
 * @author schueler
 */
public class EditorMenu implements Drawable
{

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(1000 , 0, 200, 800);
    }
    
}
