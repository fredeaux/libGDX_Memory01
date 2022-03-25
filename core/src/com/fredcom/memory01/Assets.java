package com.fredcom.memory01;


import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class Assets {

    public static AssetManager am;
    public static Texture backGroundTexture;
    public static ArrayList<Texture> returnedCardsTextureArrayList = new ArrayList<>();



    String background = "bg.png";
    ArrayList<String> rCardsAL = new ArrayList<>();



    public Assets()
    {
        am = new AssetManager();
        rCardsFilesLoad();
        loadTextures();
        assignTextures();
    }


    private void loadTextures()
    {
        am.load(background, Texture.class);

        //load texture cartes retournées
        for(String st: rCardsAL)
        {
            am.load(st, Texture.class);
        }


        am.finishLoading();
    }

    private void assignTextures()
    {
        backGroundTexture = am.get(background, Texture.class);

        //Assignement textures cartes retournées
        for(String str: rCardsAL)
        {
            returnedCardsTextureArrayList.add(am.<Texture>get(str));
        }
    }

    private void rCardsFilesLoad()
    {

        int jj = 41;
        int hh = 41;


        for(int i = 0; i<48; i++)
        {
            if(jj == hh + 8)
            {

                hh = hh - 8;
                jj = jj - 16;

            }

            if(jj < 10)
            {
                rCardsAL.add("cartes/bg_0" + (jj) + ".png");
            }
            else
            {
                rCardsAL.add("cartes/bg_" + (jj) +  ".png");
            }
            System.out.println(" JJ: " + jj);
            jj++;



        }



    }





}
