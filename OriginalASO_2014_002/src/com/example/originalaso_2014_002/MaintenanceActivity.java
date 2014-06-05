package com.example.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaintenanceActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenance_activity);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;

		switch(v.getId()){
		case R.id.button1://戻るボタン
			intent = new Intent(MaintenanceActivity.this, MainActivity.class);
			startActivity(intent);
			break;
		case R.id.button2://削除ボタン

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
	}

}
