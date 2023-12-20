package umu.tds.apps.AppMusic.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import umu.tds.apps.AppMusic.NotImplementedExcepcion;

@Entity
public class PlayList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private Set<Song> songs;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Song> getSongs() {
		return songs;
	}

	public void setSongs(Set<Song> songs) {
		this.songs = songs;
	}
	
	public Song getSong(int id) throws Exception
	{
		throw new NotImplementedExcepcion();
	}

	public PlayList() {
		
	}
	
	public void addSongToPlayList() throws Exception {
		throw new NotImplementedExcepcion();
	}
	public void removeSongFromPlayList() throws Exception {
		throw new NotImplementedExcepcion();
	}
	
	
}
