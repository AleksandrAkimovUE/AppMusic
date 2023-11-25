package umu.tds.apps.AppMusic.repository;

import org.hibernate.SessionFactory;
import umu.tds.apps.AppMusic.model.Song;

public class SongRepository extends AbstractRepository<Song>{
	public SongRepository(SessionFactory sessionFactory, Class<Song> entityType) {
		super(sessionFactory, entityType);
	}
}
