package com.Desyfadliaty.budayasunda;

import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;

public class AlatMusik extends BudayaSunda {
	
	private ImageSwitcher imageSwitcher1;
	private ImageSwitcher imageSwitcher2;
	private ImageSwitcher imageSwitcher3;
	private ImageSwitcher imageSwitcher4;
	private ImageSwitcher imageSwitcher5;
    
	private int[] galleryDegung = {R.drawable.dg1,R.drawable.dg2};
    private int[] galleryKecapi = {};
    private int[] gallerySuling = {};
    private int[] galleryAngklung = {};
    private int[] galleryKarinding = {};
    
    private int position = 0;
    private Timer timer = null;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alatmusik);
		
		 imageSwitcher1 = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
		 imageSwitcher2 = (ImageSwitcher) findViewById(R.id.imageSwitcher2);
		 imageSwitcher3 = (ImageSwitcher) findViewById(R.id.imageSwitcher3);
		 imageSwitcher4 = (ImageSwitcher) findViewById(R.id.imageSwitcher4);
		 imageSwitcher5 = (ImageSwitcher) findViewById(R.id.imageSwitcher5);
		
		  	Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
	        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.abc_fade_out);
	        imageSwitcher1.setInAnimation(fadeIn);
	        imageSwitcher1.setOutAnimation(fadeOut);         
	         
	         timer = new Timer();
		     timer.scheduleAtFixedRate(new TimerTask() {
		  
		        public void run() {
		            // avoid exception: "Only the original thread that created a view hierarchy can touch its views"
		            runOnUiThread(new Runnable() {
		                 public void run() {
		                     imageSwitcher1.setImageResource(galleryDegung[position]);
		                        position++;
		                        if (position == 1)
		                        {
		                            position = 0;
		                        }
		                }
		            });
		        }
		  
		        }, 0, 2500);
		
	}
}
