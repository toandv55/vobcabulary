package vob.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

public class StudyMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_study_menu);
		
		GridView gridView = (GridView)findViewById(R.id.gridview);
		gridView.setAdapter(new buttonTopic(this));
		
		//Grid view: So topic can co
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.study_menu, menu);
		return true;
	}
	public class buttonTopic extends BaseAdapter {

		private Context context;
		private String[] numberTopic = {
			"Chủ đề 1", "Chủ đề  2",
			"Chủ đề 3", "Chủ đề 4",
			"Chủ đề 5", "Chủ đề 6",
		};

		public buttonTopic(Context context) {
			this.context = context;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return numberTopic.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			
			Button buttonTopic = new Button(context);
			buttonTopic.setText(numberTopic[arg0]);
			final int number = arg0;
			
			buttonTopic.setOnClickListener(new OnClickListener() {
				//Dat su kien khi an vao 1 trong cac chu de
				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(context, StudyActivity.class);
					Bundle bundle = new Bundle();
					bundle.putString("nameObject", numberTopic[number]);
					intent.putExtras(bundle);
					startActivity(intent);
				}
			});
			return buttonTopic;
		}
		
	}
	
}
