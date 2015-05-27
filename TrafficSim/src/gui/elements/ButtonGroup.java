/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.elements;

import gui.elements.Button.ButtonTemplate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import org.newdawn.slick.Color;

/**
 *
 * @author schueler
 */
public class ButtonGroup implements ActionListener
{
    private ArrayList<Button> buttons;
    private ButtonTemplate template;
    private int x;
    private int y;
    
    public ButtonGroup()
    {
        template = new ButtonTemplate(Color.black , Color.darkGray, Color.white, 5 , 120 , 40);
    }
    
    public void addButton(String text)
    {
        buttons.add(new Button(x+(120*buttons.size()), y, text, template, this));
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
