package com.example.originalaso_2014_002;

//import com.example.originalaso_2014_001.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;

		switch(v.getId()){
		case R.id.button1://メンテボタン
			intent = new Intent(MainActivity.this, MaintenanceActivity.class);
			startActivity(intent);
			break;
		case R.id.button2://登録ボタン
			EditText etd1 = (EditText)findViewById(R.id.editText1);
			String str = etd1.getText().toString();

			break;
		case R.id.button3://ひとことチェックボタン
			/*
			Random rnd = new Random();
			int random = rnd.nextInt(4);
			intent.putExtra("num", random);
			*/
			intent = new Intent(MainActivity.this, HitokotoActivity.class);
			startActivity(intent);
			break;
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		Button butOK = (Button)findViewById(R.id.button1);
		butOK.setOnClickListener(this);
		Button butOK2 = (Button)findViewById(R.id.button2);
		butOK2.setOnClickListener(this);
		Button butOK3 = (Button)findViewById(R.id.button3);
		butOK3.setOnClickListener(this);
	}

}
