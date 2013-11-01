package vob.activity;

import java.util.List;

import vob.activity.R;
import vob.model.Topic;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {

	public static List<Topic> listTopic;
	public static PageFragment newInstance(List<Topic> list, int index) {
		PageFragment pageFragment = new PageFragment();
		listTopic = list;
		
		Bundle bundle = new Bundle();
	    bundle.putInt("index", index);
	    pageFragment.setArguments(bundle);
		return pageFragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		 View view = inflater.inflate(R.layout.custom_view, container, false); 
		 TextView tv = (TextView)view.findViewById(R.id.textview);
		 tv.setText(listTopic.get(getArguments().getInt("index")).getName());
		return view;
	}
}
