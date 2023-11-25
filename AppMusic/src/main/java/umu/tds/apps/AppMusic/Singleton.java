package umu.tds.apps.AppMusic;

import umu.tds.apps.AppMusic.Singleton;

public class Singleton<T> {
	private static Singleton<?> instance;
	private final T object;
	
	private Singleton(T object) {
		this.object = object;
	}
	
	public static synchronized <T> Singleton<T> getInstance(T object){
		if(instance == null) {
			instance = new Singleton<T>(object);
		}
		return (Singleton<T>) instance;
	}
	
	public T getObject() {
		return object;
	}
}
