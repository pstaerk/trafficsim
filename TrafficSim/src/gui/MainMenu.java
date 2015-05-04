/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.Button.ButtonTemplate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import trafficsim.TrafficSim;

/**
 *
 * @author schueler
 */
public class MainMenu implements GameState, ActionListener {

    private final int ID;
    private StateBasedGame sbGame;
    private Button mapEditorButton;
    private Button simulatorUIButton;

    public MainMenu(int MAINMENU) {
        this.ID = MAINMENU;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == mapEditorButton)
        {
            sbGame.enterState(TrafficSim.MAPEDITOR);
        } else if(ae.getSource() == simulatorUIButton)
        {
            sbGame.enterState(TrafficSim.SIMULATOR);
        }
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        sbGame = game;
        ButtonTemplate template = new Button.ButtonTemplate(Color.white, Color.gray, Color.black, 10, 160, 40);
        mapEditorButton = new Button(420, 40, "Map Editor", template, this);
        simulatorUIButton = new Button(420, 160, "Simulator", template, this);
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        mapEditorButton.draw(g);
        simulatorUIButton.draw(g);
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
        mapEditorButton.mouseClicked(x, y);
        simulatorUIButton.mouseClicked(x, y);
    }

    @Override
    public void mousePressed(int button, int x, int y) {
    }

    @Override
    public void mouseReleased(int button, int x, int y) {
    }

    @Override
    public void mouseMoved(int oldx, int oldy, int newx, int newy) {
        mapEditorButton.mouseHasMoved(newx, newy);
        simulatorUIButton.mouseHasMoved(newx, newy);
    }

    @Override
    public void mouseDragged(int oldx, int oldy, int newx, int newy) {
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
