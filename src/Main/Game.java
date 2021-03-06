package Main;

import javax.swing.*;

/**
 * File: Game.java
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

public class Game {

    public static final String version = "v0.0.1 Alpha";

    public static void main(String[] args) {
        JFrame game = new JFrame("2D Runner - " + version);
        game.setContentPane(new GamePanel());
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setResizable(false);
        game.setVisible(true);
        game.pack();
    }
}
