package com.Desyfadliaty.budayasunda;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





public class DataGame extends Activity {
 	String pertanyaan[] = {
 			"Bahasa Arabna Buah",
 			"Bahasa Arabna Permadani",
 			"Bahasa Arabna Kalender",
 			"Bahasa Arabna Parabot dapur",
 			"Kaleng Naon Nu Paur",	
 			"Kaca naon nu Berat",	
 			"Tahu naon nu pangbauna",	
 			"Ucing Ngising Muru naon",	
 			"Jelma m*d*l bari naon",	
 			"Oray hejo ngaringkel Udud",	
 			"Kumaha ngabedakeun gajah leutik jeung gajah gede",	
 			"Di asupkeun kalah kaluar",		
 			"Basa Jepangna Botak",		
 			"Basa Arabna Kopeah",	
 			"Basa Jepangna Boke",	
 			"Mun Turun Lila, Mun Naek Gancang",	
 			"Nabi nu sok ngaroko",	
 			"Sapi naon nu gancang",	
 			"Di teuk teuk angger panjang",		
 			"Aki-aki ragrag surak",	
 			"Lele naon nu sok aya di sisi jalan",	
 			"Lomari naon nu sok nyanyi",	
 			"Jelema meuli bantal keur naon"
 			};
 	
 	String jawab[]={
 			"alpukat",
 			"alketip",
 			"almenak",
 			"almunium",
 			"kalengkahan maung",
 			"kacalikan gajah",
 			"tahuntu sia",
 			"murukungkung",
 			"barijil",
 			"obat nyamuk",
 			"di ayak",
 			"kancing",
 			"karineke",
 			"wadahulu",
 			"sakurata",
 			"leho",
 			"nabi wir",
 			"sapida balap",
 			"kacang panjang",
 			"sakti",
 			"lelepon umum",
 			"lomari irama",
 			"keur hudang",
 	};

	
 	private TextView txt1;
 	private TextView txt2;
 	private TextView txt3;
 	
 	private EditText edt1;

 	private Button btn1;
 	private Button btn2;

	int f;
	
	Random rand = new Random(); 
	int value;
	
 	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.data_game);

		
		value = rand.nextInt(21);
		
		txt1 = (TextView) findViewById(R.id.textView1);
		txt2 = (TextView) findViewById(R.id.textView2);
		txt3 = (TextView) findViewById(R.id.textView4);
		
		edt1 = (EditText) findViewById(R.id.editText1);
		
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		
		txt1.setText(pertanyaan[value]);
		
			btn1.setOnClickListener(new OnClickListener() {
			Intent new_intent= new Intent("com.Desyfadliaty.budayasunda.DataGame");
			
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					for(int i=0; i<pertanyaan.length; i++){
						if(edt1.getText().toString().toLowerCase().equals(jawab[value])){		
							txt2.setText("Leres Agan !! ");
							startActivity(new_intent);
						}else{
							txt2.setText("Punten, Lepat Agan ");
						}	
					}	
				}
			});
			
			btn2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
				
						Intent new_intent= new Intent("com.Desyfadliaty.budayasunda.MainActivity");
						startActivity(new_intent);
				
				}
			});
		}
}
