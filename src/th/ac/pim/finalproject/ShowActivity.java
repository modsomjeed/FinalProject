package th.ac.pim.finalproject;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class ShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
		
		Handler handler = new Handler();
		// run a thread after 3 seconds to start the home screen
		handler.postDelayed(new Runnable() {

			@Override
			public void run() {

				finish();
				Intent intent = new Intent(ShowActivity.this, MainActivity.class);
				startActivity(intent);
			}

		}, 3000);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show, menu);
		return true;
		
		
	}

}
