package Game.PocketMonster.Entities;

import Main.Handler;

import java.awt.image.BufferedImage;

/**
 * Created by AlexVR on 3/11/2020
 */
public class BaseSolidEntity extends BaseEntity {
    public BaseSolidEntity(BufferedImage sprite, int x, int y, String name, Handler handler) {
        super(sprite, x, y, name, handler);
    }
}
