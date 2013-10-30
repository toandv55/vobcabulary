package vob.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class StartMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_menu, menu);
		return true;
	}
	/**
	 * Switches to PlayMenuActivity
	 * @param v
	 */
	public void play(View v) {
		Intent intent = new Intent(this, StudyMenuActivity.class);
		startActivity(intent);
	}
	
	public void review(View v) {
		Intent intent = new Intent(this, ReviewMenuActivity.class);
		startActivity(intent);
	}
	
	public void setting(View v) {
		Intent intent = new Intent(this, SettingActivity.class);
		startActivity(intent);
	}
	public void exit(View v) {
		finish();
		System.exit(0);
	}

}
