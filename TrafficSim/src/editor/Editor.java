/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author schueler
 */
public class Editor extends StateBasedGame
{
    public static final int WIDTH   = 1200;
    public static final int HEIGHT  = 800;
    public static final int FPS     = 60;
    
    public static final int MAINMENU     = 0;
    public static final int MAPEDITOR     = 1;

    
    public Editor()
    {
        super("Mapeditor");
    }
    
    @Override
    public void initStatesList(GameContainer container) throws SlickException
    {
        //addState(new MainMenu(MAINMENU));
        addState(new MapEditor(MAPEDITOR));
    }
    
    public static void main(String[] args)
    {
        try {
            AppGameContainer app = new AppGameContainer(new Editor());
            app.setDisplayMode(WIDTH, HEIGHT, false);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(true);
            app.start();
        } catch(SlickException e) {
            e.printStackTrace();
        }
    }
}
