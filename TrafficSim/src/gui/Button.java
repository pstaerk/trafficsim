/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 *
 * @author helicopterfly
 */
public class Button {

    private final Color colorNormal;
    private final Color colorHover;
    private final Color colorPressed;
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final int cornerRadius;
    private boolean isPressed = false;
    private boolean isHover = false;
    private ActionListener al;

    public Button(int x, int y, ButtonTemplate template, ActionListener al) {
        this.x = x;
        this.y = y;
        this.width = template.width;
        this.height = template.height;
        this.colorNormal = template.colorNormal;
        this.colorHover = template.colorHover;
        this.colorPressed = template.colorPressed;
        this.cornerRadius = template.cornerRadius;
        this.al = al;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public Color getColorHover() {
        return colorHover;
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw(Graphics g) {
        if (isHover) {
            if (isPressed) {
                g.setColor(colorPressed);
            } else{
                g.setColor(colorHover);
            } 
        } else {
            g.setColor(colorNormal);
        }
        g.fillRoundRect(x, y, width, height, cornerRadius);
    }

    public void mouseHasMoved(int x, int y) {
        if (x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height) {
            isHover = true;
        } else {
            isHover = false;
        }
    }

    public void mouseIsPressed(int x, int y) {
        if (x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height) {
            isPressed = true;
        } else {
            isPressed = false;
        }
    }

    public void mouseClicked(int x, int y) {
        if (x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height) {
            al.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, ""));
        }
    }

    public static class ButtonTemplate {

        private final Color colorNormal;
        private final Color colorHover;
        private final Color colorPressed;
        private final int cornerRadius;
        private final int width;
        private final int height;

        public ButtonTemplate(Color colorNormal, Color colorHover, Color colorPressed, int cornerRadius, int width, int height) {
            this.colorNormal = colorNormal;
            this.colorHover = colorHover;
            this.colorPressed = colorPressed;
            this.cornerRadius = cornerRadius;
            this.width = width;
            this.height = height;
        }

        
    }
}
