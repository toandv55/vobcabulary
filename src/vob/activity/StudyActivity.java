package vob.activity;

import java.util.ArrayList;
import java.util.List;

import vob.model.Topic;
import vob.model.Word;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class StudyActivity extends FragmentActivity  {
	private static List<Topic> topics = new ArrayList<Topic>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_study);
		
		//Set data to DEMO 
		for(int i = 0; i < 10; i++) {
			List<Word> list = new ArrayList<Word>();
			topics.add(new Topic(i, "name:" + (i + 1), "c:\\undefined", list));
		}
		
		ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
		viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.study, menu);
		return true;
	}
	
	private static class MyFragmentPagerAdapter extends FragmentPagerAdapter {
	    public MyFragmentPagerAdapter(FragmentManager fm)   {
	        super(fm);
	    }

	    @Override
	    public Fragment getItem(int index) {
	        return PageFragment.newInstance(topics, index);
	    }

	    @Override
	    public int getCount() {
	        return topics.size();
	    }
	}
}

