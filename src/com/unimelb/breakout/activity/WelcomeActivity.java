package com.unimelb.breakout.activity;

import com.example.breakout.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        this.setButtonListner();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
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
    
    public void setButtonListner(){
    	final Button spButton  = (Button) this.findViewById(R.id.button_single_player);
    	final Button mpButton  = (Button) this.findViewById(R.id.button_multi_player);
    	final Button scoreButton  = (Button) this.findViewById(R.id.button_score);
    	final Button downloadButton  = (Button) this.findViewById(R.id.button_download);
    	final Button quitButton  = (Button) this.findViewById(R.id.button_quit);

    	spButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
				startActivity(intent);
			}
    		
    	});
    	
    	mpButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
    		
    	});
    	
    	scoreButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
    		
    	});
    	
    	downloadButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
    		
    	});
    	  	
    	quitButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//quit the game
				finish();
			}
    		
    	});
    }
    
}