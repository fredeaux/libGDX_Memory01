package com.fredcom.memory01;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import jdk.internal.org.jline.utils.Display;

import java.util.ArrayList;
import java.util.Random;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	ShapeRenderer sr;
	Assets assets;
	int second = 0;
	public static float delta;
	float deltaCompte;
	Random random;
	int nbRandom;
	boolean startDrawCards = false;
	ArrayList<Integer> listNbCardsReturn = new ArrayList<>();
	ArrayList<Boolean> listBoolCardsReturn = new ArrayList<>();
	int nbCardsPlayStart = 0;
	int width;
	int height;


	
	@Override
	public void create () {


		width = Gdx.app.getGraphics().getWidth();
		height = Gdx.app.getGraphics().getHeight();
		batch = new SpriteBatch();
		sr = new ShapeRenderer();
		assets = new Assets();
		this.random = new Random();
		start();





	}

	@Override
	public void render () {

		//Update:
		delta = Gdx.graphics.getDeltaTime();
		deltaCompte += delta;
		if(deltaCompte > 1)
		{
			second++;
			deltaCompte = 0;
		}


		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
		{
			start();
		}


		System.out.println("mouseX: " + Gdx.input.getX() + "  mouseY: " + (-(Gdx.input.getY() - height )));







		//Draw:
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		batch.setColor(1,1,1,0.3f);
		batch.draw(Assets.backGroundTexture, 0, 0);
		batch.setColor(1,1,1,0.7f);

		cardReturn();

		batch.end();

		drawLines();





	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Assets.am.dispose();

	}

	private void start()
	{

		nbCardsPlayStart = 18; //random.nextInt(47) + 1;

		int drawCard = 0;
		listBoolCardsReturn.clear();

		for(int i = 0; i < 48; i++)
		{
			if(random.nextInt(101) > 50 && drawCard < nbCardsPlayStart)
			{
				listBoolCardsReturn.add(true);
				drawCard++;
			}
			else
			{
				listBoolCardsReturn.add(false);
			}
		}

	}


	private void drawLines()
	{
		sr.begin(ShapeRenderer.ShapeType.Line);
		sr.line(0,100,800,100);
		sr.line(0,200,800,200);
		sr.line(0, 300, 800, 300);
		sr.line(0,400,800,400);
		sr.line(0,500,800,500);
		sr.line(400,0,400,600);
		sr.line(100,0,100,600);
		sr.line(200,0,200,600);
		sr.line(300,0,300,600);
		sr.line(500,0,500,600);
		sr.line(600,0,600,600);
		sr.line(700,0,700,600);
		sr.end();
	}


	private void random()
	{

		this.nbRandom = random.nextInt(48);



	}

	private void cardReturn()
	{
		//Choix des cases et cartes retournées à présenter au démarrage du jeu
		int i = 0;

		for(int l = 0; l < 505; l += 100)
		{
			for(int c = 0; c < 707; c += 100)
			{

				if(listNbCardsReturn.size() < Assets.returnedCardsTextureArrayList.size())
				{
					listNbCardsReturn.add(i);
				}

				if(listBoolCardsReturn.get(i))
				{
					batch.draw(Assets.returnedCardsTextureArrayList.get(listNbCardsReturn.get(i)), c, l);
				}


				i++;
			}
		}
	}
}



