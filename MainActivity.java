package com.example.passpathamer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
	}
	public void addListenerOnButton() {
		 
		final Context context = this;
		button = (Button) findViewById(R.id.button5);
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, ActivityTwo.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
		 //--- text view---
	//	TextView txtView = (TextView) findViewById(R.id.textView2);
	    //   final String Label = txtView.getText().toString();
       // txtView.setOnClickListener(new View.OnClickListener() {
          // public void onClick(View v) {
              
      //  	   if(v.getId()==R.id.textView2)
			//	public mapactivity(View v)
        	  // {
        		//   Intent someName = new Intent(MainActivity.this, ActivityTwo.class);
        		  //  startActivity(someName);
        	     // setContentView(R.layout.map); 
        	   
        	   // Toast.makeText(getApplicationContext(), 
               //"Search Page is under development",
              // Toast.LENGTH_LONG).show();
         //  }
       // });

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
}
