package vob.model;

import vob.annotation.BelongsTo;
import vob.annotation.Id;

public class Word {
	@Id
	private String word;
	private String meaning;
	private String phonetic;
	private String imageURL;
	private String audioURL;
	private int topicId;
	private int islearned;

	@BelongsTo(parent = "Topics")
	private Topic topic;

	// Constructor block
	public Word() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Word(String word, String phonetic, String meaning, String imageURL,
			String audioURL, Topic topic) {
		super();
		this.word = word;
		this.phonetic = phonetic;
		this.meaning = meaning;
		this.imageURL = imageURL;
		this.audioURL = audioURL;
		this.topic = topic;
		this.islearned = 0 ;
	}

	// Getter and Setter block
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getAudioURL() {
		return audioURL;
	}

	public void setAudioURL(String audioURL) {
		this.audioURL = audioURL;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getPhonetic() {
		return phonetic;
	}

	public void setPhonetic(String phonetic) {
		this.phonetic = phonetic;
	}

	public int getIslearned() {
		return islearned;
	}

	public void setIslearned(int islearned) {
		this.islearned = islearned;
	}
	
}
