package trafficsim;

import gui.SimulatorUI;
import gui.MainMenu;
import gui.MapEditor;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Main class for execution of the simulation
 * <p/>
 * @author helicopterfly
 */
public class TrafficSim extends StateBasedGame {

    /**
     * Simulator
     */
    private static Simulator simulator;

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;
    public static final int FPS = 60;

    public static final int MAINMENU = 0;
    public static final int MAPEDITOR = 1;
    public static final int SIMULATOR = 2;

    public TrafficSim() {
        super("Mapeditor");
    }

    @Override
    public void initStatesList(GameContainer container) throws SlickException {
        addState(new MainMenu(MAINMENU));
        addState(new MapEditor(MAPEDITOR));
        addState(new SimulatorUI(SIMULATOR));
    }

    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new TrafficSim());
            app.setDisplayMode(WIDTH, HEIGHT, false);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(true);
            app.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
