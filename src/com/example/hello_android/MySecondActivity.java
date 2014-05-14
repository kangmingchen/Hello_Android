package com.example.hello_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MySecondActivity extends Activity implements OnClickListener {

	private EditText getText;
	private Button back;
	private String getString;
	private Intent backIntent;
	private Bundle backBundle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		getText=(EditText)findViewById(R.id.et_keyword);
		back=(Button)findViewById(R.id.btn_return);
		back.setOnClickListener(this);
		
		Bundle getBundle=getIntent().getExtras();
		String default_keyword=getBundle.getString("MY_DEFAULTSTRING_ID");
		getText.setText(default_keyword);
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.btn_return){
			getString=getText.getText().toString();
			backIntent=new Intent();
			backBundle=new Bundle();
			backBundle.putString("GET_TEXT", getString);
			backIntent.putExtras(backBundle);
			setResult(RESULT_OK,backIntent);
			finish();
		}
	}

}
