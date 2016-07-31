package com.example.audioplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity {
	Button buttonPlay, ButtonPause;
	MediaPlayer player;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		buttonPlay = (Button) findViewById(R.id.button1);
		ButtonPause = (Button) findViewById(R.id.button2);

		// intialize mediaPlayer with file
		player = MediaPlayer.create(HomeActivity.this, R.raw.waka);

		buttonPlay.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (!player.isPlaying()) {
					try {
						//player.prepare();
						player.start();
					} catch (Exception ex) {
						Log.e("error", ex.toString());
					}
				}// eof if

			}// eof onclick
		});
		
		ButtonPause.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (player.isPlaying()) {
					
						player.pause();
					
					}
				

			}// eof onclick
			
		});
		
		
	}
}
