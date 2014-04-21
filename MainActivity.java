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
// php post stuff
import java.net.URL;
import java.net.URLConnection;
import java.io.PrintStream;

public class MainActivity extends Activity {
	
	Button button;
	Button openButton = (Button) findViewById(R.id.button1);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
		final int user_id = 1;
		final int loc_id = 2; // TEST DATA
		// user's id upon login, location id of recently-searched door

		openButton.setOnClickListener(new View.OnClickListener() {
    			public void onClick(View v) {
				authenticateUser(user_id, loc_id);
			}
		});
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
	
	public void authenticateUser(int uid, int lid) {
		//int tmp_user_id=1; int tmp_loc_id=2; // TEST DATA
		//display.setText("Yo yo"); // DEBUG LINE

		try {
			// Open a connection to the PHP script
			URL url = new URL("http://fallon.uni.me:8080/pathPassConnect.php");
			URLConnection con = url.openConnection();

			// Activate output
			con.setDoOutput(true);
			PrintStream ps = new PrintStream(con.getOutputStream());

			// Send parameters for PHP Post request
			ps.print("userName="+uid);
			ps.print("&locName="+lid);
		
			// Get input stream, process request
			con.getInputStream();
 
			// Close the print stream
			ps.close();
		}
		catch(Exception e) {}
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
