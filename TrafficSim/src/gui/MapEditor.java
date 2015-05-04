/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import trafficsim.Map;

/**
 *
 * @author schueler
 */
public class MapEditor implements GameState {

    private final int ID;
    private StateBasedGame sbGame;
    private Map map;
    private int tempWidth = 120;
    private int tempHeight = 80;
    private int zoom = 10;
    private int xoffset = 0;
    private int yoffset = 0;

    public MapEditor(int MAINMENU) {
        this.ID = MAINMENU;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        sbGame = game;
        map = new Map();
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        g.setClip(0, 0, 1200, 800);
        g.setColor(Color.white);
        for (int i = 0; i <= tempWidth; i++) {
            g.drawLine(i * zoom + xoffset, yoffset, i * zoom + xoffset, tempHeight * zoom + yoffset);
        }
        for (int i = 0; i <= tempHeight; i++) {
            g.drawLine(xoffset, i * zoom + yoffset, tempWidth * zoom + xoffset, i * zoom + yoffset);
        }
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    }

    @Override
    public void enter(GameContainer container, StateBasedGame game) throws SlickException {
        sbGame = game;
    }

    @Override
    public void leave(GameContainer container, StateBasedGame game) throws SlickException {
    }

    @Override
    public void mouseWheelMoved(int change) {
    }

    @Override
    public void mouseClicked(int button, int x, int y, int clickCount) {
    }

    @Override
    public void mousePressed(int button, int x, int y) {
    }

    @Override
    public void mouseReleased(int button, int x, int y) {
    }

    @Override
    public void mouseMoved(int oldx, int oldy, int newx, int newy) {
    }

    @Override
    public void mouseDragged(int oldx, int oldy, int newx, int newy) {
        xoffset -= (oldx - newx);
        yoffset -= (oldy - newy);
    }

    @Override
    public void setInput(Input input) {
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
    }

    @Override
    public void keyPressed(int key, char c) {
    }

    @Override
    public void keyReleased(int key, char c) {
    }

    @Override
    public void controllerLeftPressed(int controller) {
    }

    @Override
    public void controllerLeftReleased(int controller) {
    }

    @Override
    public void controllerRightPressed(int controller) {
    }

    @Override
    public void controllerRightReleased(int controller) {
    }

    @Override
    public void controllerUpPressed(int controller) {
    }

    @Override
    public void controllerUpReleased(int controller) {
    }

    @Override
    public void controllerDownPressed(int controller) {
    }

    @Override
    public void controllerDownReleased(int controller) {
    }

    @Override
    public void controllerButtonPressed(int controller, int button) {
    }

    @Override
    public void controllerButtonReleased(int controller, int button) {
    }

}
