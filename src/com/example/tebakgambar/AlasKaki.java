package com.example.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AlasKaki extends Activity {
	//deklarasi variabel
	EditText jawabanTxt;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alas_kaki);
		//cari komponen edit text
        jawabanTxt = (EditText ) findViewById(R.id.editText1 );
        //setting inpit dalam huruf besar
        jawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
	}
	
	public void CekJawaban(View v){
    	String jawabanBenar = "ALAS KAKI";
    	String jawabanUser = jawabanTxt.getText().toString();
    	if(jawabanUser.equals(jawabanBenar)){
    		//pesan toas
    		Toast.makeText(getApplicationContext(),
    				"JAWABAN TEPAT!!!!!!!!1", Toast.LENGTH_LONG).show();
    		Intent i = new Intent(getApplicationContext(), CeritaMiring.class);
    		startActivity(i);
    		
    	}
    	else{
    		//pesan toast
    		Toast.makeText(getApplicationContext(),
    				"JAWABAN benar benar salah!!!!!!!!1", Toast.LENGTH_LONG).show();
    				
    	}
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alas_kaki, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
