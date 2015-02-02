package GameState;

import TileMap.Background;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * File: MenuState.java
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

public class MenuState extends GameState {

    private Background bg;
    private String[] options = { "Play", "Help", "About", "Quit" };
    private int currentOpt = 0;

    public MenuState(GameStateManager gsm) {
        this.gsm = gsm;
        bg = new Background("/Backgrounds/menubg.gif", 1);
        bg.setVector(-0.1f, 0);
    }

    public void init() {

    }

    public void update() {
        bg.update();
    }

    public void draw(Graphics2D graphics) {
        bg.draw(graphics);
        graphics.setColor(new Color(56, 76, 77));
        graphics.setFont(new Font("Sans Serif", Font.PLAIN, 28));
        graphics.drawString("2D Runner Test", 50, 70);
        graphics.setFont(new Font("Sans Serif", Font.PLAIN, 18));
        for(int i = 0; i < options.length; i++) {
            if(i == currentOpt)
                graphics.setColor(new Color(175, 175, 175));
            else
                graphics.setColor(new Color(89, 105, 116));
            graphics.drawString(options[i], 145, 25 * i + 140);
        }
    }

    private void select(int opt) {
        switch(opt) {
            case 0:
                gsm.setState(GameStateManager.LVL1);
                break;
            case 1:
                //Help
                break;
            case 2:
                //About
                break;
            case 3:
                System.exit(0);
                break;
            default:
                gsm.setState(GameStateManager.LVL1);
                break;
        }
    }

    public void keyPressed(int k) {
        if(k == KeyEvent.VK_ENTER || k == KeyEvent.VK_SPACE)
            select(currentOpt);
        if(k == KeyEvent.VK_UP || k == KeyEvent.VK_W)
            currentOpt--;
        if(k == KeyEvent.VK_DOWN || k == KeyEvent.VK_S)
            currentOpt++;
        if(currentOpt < 0)
            currentOpt = options.length - 1;
        if(currentOpt >= options.length)
            currentOpt = 0;
    }

    public void keyReleased(int k) {

    }
}
