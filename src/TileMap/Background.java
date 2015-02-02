package TileMap;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * File: Background.java
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

public class Background {

    private BufferedImage image;
    private double x, y, dx, dy, moveScale;

    public Background(String file, double moveScale) {
        try {
            image = ImageIO.read(getClass().getResourceAsStream(file));
            this.moveScale = moveScale;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setPos(double x, double y) {
        this.x = (x * moveScale) % GamePanel.WIDTH;
        this.y = (y * moveScale) % GamePanel.HEIGHT;
    }

    public void setVector(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void update() {
        x = (x + dx) % GamePanel.WIDTH;
        y = (y + dy) % GamePanel.HEIGHT;
    }

    public void draw(Graphics2D graphics) {
        graphics.drawImage(image, (int)x, (int)y, null);
        if(x < 0)
            graphics.drawImage(image, (int)x + GamePanel.WIDTH, (int)y, null);
        if(x > 0)
            graphics.drawImage(image, (int)x - GamePanel.WIDTH, (int)y, null);
    }
}
