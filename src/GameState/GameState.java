package GameState;

import java.awt.*;

/**
 * File: GameState.java
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

public abstract class GameState {

    protected GameStateManager gsm;

    public abstract void init();
    public abstract void update();
    public abstract void draw(Graphics2D graphics);
    public abstract void keyPressed(int k);
    public abstract void keyReleased(int k);
}
