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
		 * Application.LOG_NONE: �������е�log()
		 * Application.LOG_DEBUG: ��ʾ>=debug�����log
		 * Application.LOG_INFO: ��ʾ>=info���� ��log
		 * Application.LOG_ERROR: ��ʾ>=error�����log
		 * 
		 * ��������Ĺ�ϵ����:
		 * verbose
		 * debug
		 * info
		 * warn
		 * error
		 * asset
		 */
		Gdx.app.setLogLevel(Application.LOG_ERROR);// �������app��log�ļ���,Ĭ����LOG_INFO
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����

		Gdx.app.log("mytag ", "hello world");// ��info�ļ����log
		Gdx.app.error("mytag error", "log error");// һerror�����log
		Gdx.app.debug("----------->mytag debug", "log debug");// һdebug�����log
		
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
