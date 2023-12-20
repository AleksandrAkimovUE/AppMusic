package umu.tds.apps.AppMusic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private Interpreter interpreter;
	private MusicStyle musicStyle;
	private String filepath;
	private int timesPlayed;
	
	public Song() {
		
	}
}
