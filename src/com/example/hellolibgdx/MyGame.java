package com.example.hellolibgdx;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	@Override
	public void create() {

		/**
		 * Application.LOG_NONE: 隐藏所有的log()
		 * Application.LOG_DEBUG: 显示>=debug级别的log
		 * Application.LOG_INFO: 显示>=info级别 的log
		 * Application.LOG_ERROR: 显示>=error级别的log
		 * 
		 * 各个级别的关系如下:
		 * verbose
		 * debug
		 * info
		 * warn
		 * error
		 * asset
		 */
		Gdx.app.setLogLevel(Application.LOG_ERROR);// 设置这个app的log的级别,默认是LOG_INFO
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏

		Gdx.app.log("mytag ", "hello world");// 以info的级别打log
		Gdx.app.error("mytag error", "log error");// 一error级别打log
		Gdx.app.debug("----------->mytag debug", "log debug");// 一debug级别打log
		
	}
	
	

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
