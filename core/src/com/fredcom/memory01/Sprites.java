package com.fredcom.memory01;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Sprites extends Sprite {

    Texture texture;
    int X;
    int Y;
    int width;
    int height;
    String name;




    public Sprites(String name, Texture texture, int X, int Y, int width, int height)
    {
        super(texture);
        this.texture = texture;
        this.X = X - 64;
        this.Y = Y - 64;
        this.width = width;
        this.height = height;
        this.setPosition(this.X, this.Y);
        this.setSize(this.width, this.height);
        this.name = name;


    }




}
