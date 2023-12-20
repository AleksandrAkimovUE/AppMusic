package umu.tds.apps.AppMusic.controller;

import org.hibernate.SessionFactory;

import umu.tds.apps.AppMusic.Singleton;
import umu.tds.apps.AppMusic.repository.SongRepository;
import umu.tds.apps.AppMusic.repository.UserRepository;

public class AppMusicController {
	private static Singleton<UserRepository> userRepositorySingleton;
	private static Singleton<SongRepository> songRepositorySingleton;
	
	public AppMusicController(SessionFactory sessionFactory) {
		 userRepositorySingleton = Singleton.getInstance(new UserRepository(sessionFactory));
		 songRepositorySingleton = Singleton.getInstance(new SongRepository(sessionFactory));
	}
}
