/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.elements;

import gui.elements.Button.ButtonColorTemplate;
import gui.elements.Button.ButtonTemplate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

/**
 *
 * @author schueler
 */
public class ButtonGroup implements ActionListener, Drawable
{
    private ArrayList<Button> buttons;
    private final ButtonTemplate template;
    private final ButtonColorTemplate activeColors;
    private final ButtonColorTemplate passiveColors;
    private final int x;
    private final int y;
    private int selectedButton = 0;
    
    public ButtonGroup(int x, int y)
    {
        this.x = x;
        this.y = y;
        template = new ButtonTemplate(Color.black , Color.darkGray, Color.white, 5 , 120 , 40);
        passiveColors = new ButtonColorTemplate(Color.black , Color.darkGray, Color.white);
        activeColors = new ButtonColorTemplate(Color.white , Color.lightGray, Color.black);
    }
    
    public void addButton(String text)
    {
        buttons.add(new Button(x+(120*buttons.size()), y, text, template, this));
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        for(Button b : buttons)
        {
            if(b == e.getSource())
            {
                buttons.get(selectedButton).changeColors(passiveColors);
                selectedButton = buttons.indexOf(b);
                b.changeColors(activeColors);
            }
        }
    }

    @Override
    public void draw(Graphics g)
    {
        for(Button b : buttons)
        {
            b.draw(g);
        }
    }
}
