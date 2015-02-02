package GameState;

import java.awt.*;
import java.util.ArrayList;

/**
 * File: GameStateManager.java
 * Created by Atlas IND on 2/2/15.
 * [2014] - [2015] Rostiss Development
 * All rights reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Rostiss Development and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Rostiss Development
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Rostiss Development.
 */

public class GameStateManager {

    private ArrayList<GameState> gameStates;
    private int currentState;

    public static final int MENU = 0;
    public static final int LVL1 = 1;

    public GameStateManager() {
        gameStates = new ArrayList<GameState>();
        currentState = MENU;
        gameStates.add(new MenuState(this));
    }

    public void setState(int state) {
        currentState = state;
        gameStates.get(currentState).init();
    }

    public void update() {
        gameStates.get(currentState).update();
    }

    public void draw(Graphics2D graphics) {
        gameStates.get(currentState).draw(graphics);
    }

    public void keyPressed(int key) {
        gameStates.get(currentState).keyPressed(key);
    }

    public void keyReleased(int key) {
        gameStates.get(currentState).keyReleased(key);
    }
}
