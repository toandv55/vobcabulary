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
		// WordMapper wm = new WordMapper(this);
		TopicMapper topicMaper = new TopicMapper(this);
		Log.d("Create TopicMapper", "Create TopicMapper");

		// Insert topic Succesfull
		Topic animal = new Topic(1, "Animal", null, null);
		Topic plant = new Topic(2, "Plant ", null, null);
		Topic human = new Topic(3, "Human", null, null);

		Log.d("Insert ", "Initiate inserting new topics  ");
		/*topicMaper.add(animal);
		topicMaper.add(plant);
		topicMaper.add(human);*/
		Log.d("Insert ", "Inserting success");

		// Create List Animal object to be inserted.

		Word bird = new Word("bird", "bÉœd", "con chim", "bird", "bird", animal);
		Word chicken = new Word("chicken", "tÊƒÉªk.Éªn", "con gÃ ", "chicken",
				"chicken", animal);
		Word cow = new Word("cow", "kaÊŠ", "con bÃ²", "cow", "cow", animal);
		Word crocodile = new Word("crocodile", "krÉ’k.É™.daÉªl", "cÃ¡ sáº¥u",
				"crocodile", "crocodile", animal);
		Word dog = new Word("dog", "dÉ’g", "con chÃ³", "dog", "dog", animal);
		Word duck = new Word("duck", "dÊŒk", "con vá»‹t", "duck", "duck",
				animal);
		Word elephant = new Word("elephant", "el.Éª.fÉ™nt ", "con voi",
				"elephant", "elephant", animal);
		Word frog = new Word("frog", "frÉ’g", "con áº¿ch", "frog", "frog",
				animal);
		Word goat = new Word("goat", "gÉ™ÊŠt", "con dÃª", "goat", "goat",
				animal);
		Word hippopotamus = new Word("hippopotamus", "hÉªp.É™pÉ’t.É™.mÉ™s ",
				"hÃ  mÃ£", "hippo", "hippo", animal);
		Word horse = new Word("horse", "hÉ”s", "con ngá»±a", "horse", "horse",
				animal);
		Word lizard = new Word("lizard", "lÉªz.É™d", "con tháº±n láº±n",
				"lizard", "lizard", animal);
		Word monkey = new Word("monkey", "mÊŒÅ‹.ki", "con khá»‰", "monkey",
				"monkey", animal);
		Word mouse = new Word("mouse", "maÊŠs", "con chuá»™t", "mouse",
				"mouse", animal);
		Word sheep = new Word("sheep", "Êƒip", "con cá»«u", "sheep", "sheep",
				animal);
		Word snake = new Word("snake", "sneÉªk", "con ráº¯n", "snake", "snake",
				animal);
		Word spider = new Word("spider", "spaÉª.dÉ™r", "con nhá»‡n", "spider",
				"spider", animal);
		Word tiger = new Word("tiger", "taÉª.gÉ™r", "con há»•", "tiger",
				"tiger", animal);

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
	/*	for (Word aWord : addList) {
			topicMaper.addWord(aWord);
		}*/
		
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
		topicMaper.updateLearned(bird, 1);
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

}
