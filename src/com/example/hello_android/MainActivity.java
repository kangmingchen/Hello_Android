package com.example.hello_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button open;
	private Intent toIntent;
	private Bundle bundle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		open = (Button) findViewById(R.id.btn_open_search);
		open.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.btn_open_search){
			toIntent=new Intent();
			toIntent.setClass(MainActivity.this, MySecondActivity.class);
			bundle=new Bundle();
			bundle.putString("MY_DEFAULTSTRING_ID", "9game.com");
			toIntent.putExtras(bundle);
			startActivity(toIntent);
		}
	}
	
}
