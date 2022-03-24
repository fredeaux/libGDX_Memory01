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
        for(int i = 0; i<48; i++)
        {
            if(i < 9)
            {
                rCardsAL.add("cartes/ct_0" + (i+1) + ".jpg");
            }
            else
            {
                rCardsAL.add("cartes/ct_" + (i+1) +  ".jpg");
            }

        }



    }





}
