package vob.model;

import java.util.List;

import vob.annotation.HasMany;
import vob.annotation.Id;
import vob.annotation.MappedWithTable;
@MappedWithTable
public class Topic {
	@Id
	private String id;
	private String name;
	
	@HasMany(children = "words")
	private List<Word> wordList;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Word> getWordList() {
		return wordList;
	}
	public void setWordList(List<Word> wordList) {
		this.wordList = wordList;
	}
}
