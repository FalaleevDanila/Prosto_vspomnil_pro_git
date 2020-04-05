package com.stgames.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Rectangle;

abstract class GameObject {

    com.badlogic.gdx.math.Rectangle bounds;
    Sprite object;

    public GameObject(Texture texture, float x, float y, float wight, float height) {
        bounds = new com.badlogic.gdx.math.Rectangle(x,y,wight,height);
        object = new Sprite(texture);
    }

    public void draw(SpriteBatch batch) {
        object.setBounds(object.getX(), object.getY(), object.getWidth(), object.getHeight());
        object.draw(batch);
    }
}

