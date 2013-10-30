package vob.orm;

import java.util.ArrayList;
import java.util.List;

import vob.model.Topic;
import vob.model.Word;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WordMapper extends SQLiteOpenHelper {
	

	private static final String DB_NAME = "vobforkid";

	public WordMapper(Context context) {
		super(context, DB_NAME, null, 1);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

	public Word add(Word word, Topic topic) {
		return word;
	}
	
	public Word find(String word) {
		return null;
	}
	
	public List<Word> all() {
		return null;
	}
	
	public Word destroy(String word) {
		return null;
	}
	
	public Word update(String word, Word newWord) {
		return null;
	}
}
