package com.fredcom.memory01;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	ShapeRenderer sr;
	Assets assets;
	
	@Override
	public void create () {



		batch = new SpriteBatch();
		sr = new ShapeRenderer();
		assets = new Assets();



	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		batch.setColor(1,1,1,0.3f);
		batch.draw(Assets.backGroundTexture, 0, 0);
		batch.setColor(1,1,1,0.7f);
		batch.draw(Assets.returnedCardsTextureArrayList.get(0), 0, 500);
		batch.draw(Assets.returnedCardsTextureArrayList.get(1), 100, 500);
		batch.draw(Assets.returnedCardsTextureArrayList.get(2), 200, 500);
		batch.end();

		drawLines();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Assets.am.dispose();

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
}



