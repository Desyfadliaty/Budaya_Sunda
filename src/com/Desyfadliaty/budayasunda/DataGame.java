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
 			"Jelema meuli bantal keur naon",
 			
 			
 			"Ari nakol bedug aya sabaraha warna?",
 			"Minyak naon anu rame?",
 			"Batman nginum fanta, ari Superman nginum naon?",
 			"Hayam naon anu sok diteangan ku jelema?", 
 			"Naon bedana onta jeung kangkung? ",
 			"Tukang naon anu teu bisa ngitung? ",
 			"Bisa naek teu bisa turun. ",
 			"kalimah naon anu dibaca ti hareup jeung ti tukang sarua hartina?",
 			"Gajah naon anu sukuna dua? ",
 			"Hurup naon anu ngeunah? ",
 			"Lamun Superman ngapung tara ngadeukeutan panonpoe, naon sababna? ",
 			"Leutik bodas pikasieuneun. ",
 			"Setan naon anu bisa nangtungkeun sepedah? ",
 			"Sato naon anu pangharam-haramna? ",
 			"Hayam naon anu sukuna 1002? ",
 			"Rancung lain landak, hejo lain tentara. ",
 			"Make baju lain manusa, make dudukuy lain patani. ",
 			"Kasur naon anu matak nyeri? ",
 			"Monyet naek kana tangkal kai, tinggal naonna?", 
 			"Pare naon anu teu ngeunah? ",
 			"Jalma meuli kasur keur naon? ",
 			"Sato naon anu sukuna dina sirah awakna dina sirah? ",
 			"Kapas 2 kg, batu 1 kg, lamun ditinggangkeun kana suku nyeri mana? ",
 			"Ku naon tukang baso nakolan mangkok? ",
 			"Soeh teu bisa dikaput, kotor teu bisa diseuseuh. ",
 			"Budak dugul asup kana embel. ",
 			"Petina hiji, mayitna loba. ",
 			"Kaca naon anu nyeri? ",
 			"Bisa naek teu bisa turun. ",
 			"kalimah naon anu dibaca ti hareup jeung ti tukang sarua hartina? ",
 			"Gajah naon anu sukuna dua? ",
 			"Hurup naon anu ngeunah? ",
 			"Lamun Superman ngapung tara ngadeukeutan panonpoe, naon sababna? ",
 			"Leutik bodas pikasieuneun. ",
 			"Setan naon anu bisa nangtungkeun sepedah? ",
 			"Sato naon anu pangharam-haramna? ",
 			"Hayam naon anu sukuna 1002? ",
 			"Rancung lain landak, hejo lain tentara. ",
 			"Make baju lain manusa, make dudukuy lain patani. ",
 			"Kasur naon anu matak nyeri? ",
 			"Palu naon anu bisa pidato? ",
 			"Akar di luhur, pucuk di handap. ",
 			"Asup tarik kaluar laun. ",
 			"Bisa turun teu bisa naek.",
 			"Boga sisit lain oray, boga makuta lain raja.",
 			"Budak dugul loba kutu. ",
 			"Diasupkeun hejo, dikaluarkeun beureum. ",
 			"Dicabak aya dilieuk euweuh. ",
 			"Dicukur buluan, teu dicukur dugul",
 			"Dipeuncit hirup, teu dipeuncit paeh. ",
 			"Disebut sakali hirup, disebut dua kali paeh.", 
 			"Ditakol nyendol teu ditakol nyendol. ",
 			"Diudag lumpat didagoan cicing. ",
 			"Gunung bitu, bandera kekelebetan.",
 			"Hiber lain ku jangjang, balik lain ku suku.",
 			"Indungna cicing anakna ancul-anculan. ",
 			"Nangkub dieusi nangkarak kosong. ",
 			"Oray hejo panonna loba.",
 			"Samak saheulay, lampuna mangrebu-rebu. ",
 			"Make baju bodas lain dokter, make topi hejo lain tentara. ", 
 			"Hayam naon anu sukuna sarebu? ",
 			"Diubek diteangan, geus kapanggih dipiceun. Naon? ",
 			"Naon sababna lamun tumpak mobil sok nundutan? ",
 			"Sato naon anu teu bisaeun mundur? ",
 			"Bangku naon anu bisa didahar? ",
 			"Cing pangnyebutkeun 5 rupa ngaran bungbuahan anu sok didahar,sakali nyebut! ",
 			"Batu naon anu teu aya di cai?",
 			"Oray naon anu teu bisaeun ngaleor? ",
 			"Jalma naon anu sukuna tilu panonna opat?",
 			"Di luar koneng, di jero bodas, nu apaleun monyet. ",
 			"Hayam naon anu sukuna hiji? ",
 			"Bapana udud, indungna nyeuseuh, anakna ceurik. ",
 			"Gajah tumpak beca, gede naonna? ",
 			"Baso dibalikkeun jadi naon?",
 			"Awakna leutik pisan, sirahna gede pisan.", 
 			"Nini-nini bongkok kumaha sarena? ",
 			"Piring naon anu bisa dipake nempo bulan? ",
 			"Manuk naon anu jangjangna dina suku, sirahna dina suku? ",
 			"Naon sababna ban mobil tina karet? ",
 			"Sapi naon anu bau? ",
 			"Piring naon anu pangrame-ramena di Indonesia ? ",
 			"Naon bedana sarimie jeung nini-nini? ",
 			"Pribumi di luar ari semah di jero. ",
 			"Dicabak beye, ditakol ngabelentrang. ", 
 			"Diusapan, didengkakkeun, tuluy diasupkeun. ",
 			"Di luar hujan angina, di WC hujan naon? ",
 			"Hayamna bodas, naonna anu hideung? ",
 			"Buah naon anu dipikaresep ku lalaki? ",
 			"Jam naon anu bisa nembang?", 

 			
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
 			
 			"Ti Luarna",
 			"Minyaksikan pertandingan sepakbola",
 			"Minumpas kejahatan",
 			"Hayam leungit",
 			"Onta mah di Arab, kangkung mah diurab",
 			"Tukang poto",
 			"Haji",
 			"Kasur ini rusak",
 			"Gajah nu keur keprok",
 			"Nya T",
 			"Sabab sieun S-na leeh kapanasan",
 			"Sireum nu napel dina huntu maung",
 			"Setandar",
 			"Anak bagong euweuh bapaan",
 			"Hayam nu keur gelut jeung titinggi",
 			"Kaktus",
 			"Bebegig",
 			"Kasura",
 			"Tinggal turunna",
 			"Parearea omong",
 			"Keur beunta",
 			"Kutu",
 			"Nyeri sukuna",
 			"Ku sendok",
 			"Keretas",
 			"Cilok",
 			"Korek api",
 			"Kacabok",
 			"Haji",
 			"Kasur ini rusak",
 			"Gajah nu keur keprok",
 			"Nya T",
 			"sieun S-na leeh kapanasan",
 			"Sireum nu napel dina huntu maung",
 			"Setandar",
 			"Anak bagong euweuh bapaan",
 			"Hayam nu keur gelut jeung titinggi",
 			"Kaktus",
 			"Bebegig",
 			"Kasura",
 			"Pa Lurah",
 			"Janggot",
 			"Leho",
 			"Hujan",
 			"Ganas",
 			"Onde-onde",
 			"seupah",
 			"Ceuli",
 			"Kadongdong",
 			"Rebab",
 			"Kuda",
 			"Goong",
 			"Kalangkang",
 			"Nu keur ngakeul sangu",
 			"Langlayangan",
 			"Lisung jeung halu",
 			"Kopeah",
 			"Peuteuy",
 			"Langit",
 			"Toge",
 			"Hayam keur pawey",
 			"Korong",
 			"Sabab banna buleud",
 			"Sato nu nukangan tembok",
 			"Bangkuang",
 			"Rujak",
 			"Batu garing",
 			"Oray nu ngalegleg linggis",
 			"Aki-aki make iteuk jeung kacamata",
 			"Cau",
 			"Hayam nu keur jengke",
 			"Kareta api",
 			"Gede bohongna",
 			"Bahe",
 			"Sireum make helm",
 			"Peureum",
 			"Piring bolong",
 			"Manuk anu katincak",
 			"Mun tina coklat pasti digembrong",
 			"Sapiteng",
 			"Piringatan 17 Agustus",
 			"Sarimie renyah, nini-nini renyoh",
 			"Tukang beca jeung panumpang",
 			"Tai kotok napel dina tihang listrik",
 			"Kacamata",
 			"Hujan-heujeun",
 			"Kalangkangna",
 			"Buahenol",
 			"Jamrud",
 	};

	
 	private TextView txt1;
 	private TextView txt2;
 	private TextView txt3;
 	
 	private EditText edt1;

 	private Button btn1;
 	private Button btn2;
 	private Button btn3;

 	
	int f;
	
	Random rand = new Random(); 
	int value;
	int g;
	
 	@Override
	protected void onCreate(Bundle savedInstanceState) {	
 		super.onCreate(savedInstanceState);
		setContentView(R.layout.data_game);

		
		value = rand.nextInt(112);
		
		txt1 = (TextView) findViewById(R.id.textView1);
		txt2 = (TextView) findViewById(R.id.textView2);
		txt3 = (TextView) findViewById(R.id.textView4);
		
		edt1 = (EditText) findViewById(R.id.editText1);
		
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		
		g=3;
		txt3.setText(String.valueOf(g));
		
		txt1.setText(pertanyaan[value]);
		
			btn1.setOnClickListener(new OnClickListener() {
				Intent new_intent= new Intent("com.Desyfadliaty.budayasunda.DataGame");
			
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
									
						if(edt1.getText().toString().toLowerCase().equals(jawab[value].toLowerCase())){		
							txt2.setText("Leres Agan !! ");
							startActivity(new_intent);
							finish();
						}else{
							txt2.setText("Punten, Lepat Agan ");
							
							g = g-1;
				
							if(g != 0){
								txt3.setText(String.valueOf(g));
							}else{
								Intent nintent= new Intent("com.Desyfadliaty.budayasunda.GameOver");
								startActivity(nintent);								
							}
						}	
					}	
				
			});
			
			
			
			btn2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
						Intent mIntent= new Intent(null, null, DataGame.this, MainActivity.class);
						startActivity(mIntent);
				
				}
			});
			
			btn3.setOnClickListener(new OnClickListener() {
				Intent new_intent= new Intent("com.Desyfadliaty.budayasunda.DataGame");
		
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					startActivity(new_intent);
					finish();
				}
			});
		}
}
