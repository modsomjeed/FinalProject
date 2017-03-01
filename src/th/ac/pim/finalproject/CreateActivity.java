package th.ac.pim.finalproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CreateActivity extends Activity {


	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginn);
		Button button1 = (Button)findViewById(R.id.confirm);
	  
		button1.setOnClickListener((new OnClickListener() {
			Intent intent = new Intent(CreateActivity.this, MainActivity.class);
			@Override
			public void onClick(View arg0) {
				EditText editText1 = (EditText)findViewById(R.id.Password);
				  EditText editText2 = (EditText)findViewById(R.id.Repassword);
				// TODO Auto-generated method stub
				if((editText1.getText().toString().equals(editText2.getText().toString()))){		
					Intent intent = new Intent(CreateActivity.this, MainActivity.class);
					startActivity(intent);
			}}
		}));
	}
			

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.login, menu);
			return true;
		}

	}
