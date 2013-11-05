package vob.activity;

import java.util.ArrayList;
import java.util.List;

import vob.model.Topic;
import vob.model.Word;
import vob.orm.TopicMapper;
import vob.orm.WordMapper;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class StartMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_menu);
		// Create the database 
		dbInit();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_menu, menu);
		return true;
	}

	/**
	 * Switches to PlayMenuActivity
	 * 
	 * @param v
	 */
	/*
	 * public void dbTest(View v){ Intent intent = new Intent (this,
	 * DBTest.class); startActivity(intent); }
	 */public void play(View v) {
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

	public void dbInit() {
		TopicMapper topicMaper = new TopicMapper(this);
		Log.d("Create TopicMapper", "Create TopicMapper");

		// Insert topic Succesfull
		Topic animal = new Topic(1, "Animal", "animal", null);
		Topic clothe = new Topic(2, "Clothes", "clothes", null);
		Topic human = new Topic(3, "Human", "human", null);

		Log.d("Insert ", "Initiate inserting new topics  ");
		
		 topicMaper.add(animal);
		 topicMaper.add(clothe);
		 topicMaper.add(human);
		 
		 
		Log.d("Insert ", "Inserting success");

		// Create List Animal object to be inserted.

		Word bird = new Word("bird", "bɜd", "con chim", "bird", "bird", animal);
		Word chicken = new Word("chicken", "tʃɪk.ɪn", "con gà", "chicken",
				"chicken", animal);
		Word cow = new Word("cow", "kaʊ", "con bò", "cow", "cow", animal);
		Word crocodile = new Word("crocodile", "krɒk.ə.daɪl", "cá sấu",
				"crocodile", "crocodile", animal);
		Word dog = new Word("dog", "dɒg", "con chó³", "dog", "dog", animal);
		Word duck = new Word("duck", "dʌk", "con vịt", "duck", "duck", animal);
		Word elephant = new Word("elephant", "el.ɪ.fənt", "con voi",
				"elephant", "elephant", animal);
		Word frog = new Word("frog", "frɒg", "con ếch", "frog", "frog", animal);
		Word goat = new Word("goat", "gəʊt", "con dê", "goat", "goat", animal);
		Word hippopotamus = new Word("hippopotamus", "hɪp.əpɒt.ə.məs", "hà mã",
				"hippo", "hippo", animal);
		Word horse = new Word("horse", "hɔs", "con ngựa", "horse", "horse",
				animal);
		Word lizard = new Word("lizard", "lɪz.əd", "thằn lằn", "lizard",
				"lizard", animal);
		Word monkey = new Word("monkey", "mʌŋ.ki", "con khỉ", "monkey",
				"monkey", animal);
		Word mouse = new Word("mouse", "maʊs", "con chuột", "mouse", "mouse",
				animal);
		Word sheep = new Word("sheep", "ʃip", "con cừu", "sheep", "sheep",
				animal);
		Word snake = new Word("snake", "sneɪk", "con rắn", "snake", "snake",
				animal);
		Word spider = new Word("spider", "spaɪ.dər", "con nhện", "spider",
				"spider", animal);
		Word tiger = new Word("tiger", "taɪ.gər", "con hổ", "tiger", "tiger",
				animal);

		List<Word> addList = new ArrayList<Word>();
		addList.add(bird);
		addList.add(chicken);
		addList.add(cow);
		addList.add(crocodile);
		addList.add(dog);
		addList.add(duck);
		addList.add(elephant);
		addList.add(frog);
		addList.add(goat);
		addList.add(hippopotamus);
		addList.add(horse);
		addList.add(lizard);
		addList.add(monkey);
		addList.add(mouse);
		addList.add(sheep);
		addList.add(snake);
		addList.add(spider);
		addList.add(tiger);

		// Insert WordList into database
		for (Word aWord : addList) {
			topicMaper.addWord(aWord);
		}

		topicMaper.updateLearned(bird, 1);
		// Check
		Log.d("Reading all Words", "Reading all Words ...");
		List<Word> list = topicMaper.getAllWord();

		for (Word aWord : list) {
			String log = "Name " + aWord.getWord() + " Phonetic  "
					+ aWord.getPhonetic() + "ID : " + aWord.getTopicId();
			Log.d("Word info ", log);
		}

		Log.d("Reading all Topic ", "Reading all Topic  ...");
		List<Topic> alist = topicMaper.getAllTopics();

		for (Topic aTopic : alist) {
			String log = "ID : " + aTopic.getId() + "Name :" + aTopic.getName();
			Log.d("Topic info ", log);
		}

		Log.d("delte a word", "Delete bird");
		topicMaper.deleteWord(bird);

	}

}
