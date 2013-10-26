package vob.orm;

import java.util.List;

import vob.model.Topic;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TopicMapper extends SQLiteOpenHelper {
	private static String DB_NAME = "vobforkid";
	public TopicMapper(Context context) {
		super(context, DB_NAME, null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	public Topic add(Topic topic) {
		return topic;
	} 
	
	public Topic find(String id) {
		return null;
	}
	
	public List<Topic> all() {
		return null;
	}
	
	public Topic destroy(String id) {
		return null;
	} 
	public Topic update(String id, Topic newTopic) {
		return null;
	}
}
