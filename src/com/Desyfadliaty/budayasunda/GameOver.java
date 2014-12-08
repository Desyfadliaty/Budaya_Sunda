package com.Desyfadliaty.budayasunda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GameOver extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gameover);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.Desyfadliaty.budayasunda.DataGame"));
			}
		});
		
		Button btn2 = (Button) findViewById(R.id.button2);
		
		btn2.setOnClickListener(new OnClickListener() {
			Intent intun = new Intent(GameOver.this,MainActivity.class);
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(intun);
			}
		});
	}
}
