package com.Desyfadliaty.budayasunda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Kamus extends Activity {
   
	String indonesia[] = {"Ganteng","Lari","Baru","Muda","Saudara","Mendung","Sehat","Cepat","Gugup","Gerah"};
   String sunda[] = {"Kasep","Lumpat","Anyar","Anom","Baraya","Ceudeum","Damang","Enggal","Geumpeur","Hareudang"};
	
   @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kamus);
		
		   	
			
		
		Button btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText et1 = (EditText) findViewById(R.id.editText1);
				EditText et2 = (EditText) findViewById(R.id.editText2);
				

				for (int i=0; i<indonesia.length;i++){
					if(indonesia[i].equals(et1.getText().toString())){
						et2.setText(sunda[i]);
					}
				}
			}
		});
		
	}
}


