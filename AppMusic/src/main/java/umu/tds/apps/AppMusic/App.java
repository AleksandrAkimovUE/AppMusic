package umu.tds.apps.AppMusic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import umu.tds.apps.AppMusic.model.User;
import umu.tds.apps.AppMusic.repository.UserRepository;

public class App {
  public static void main(String[] args) {
	  System.out.println("Creación de factoria hibernate");
	    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    System.out.println("Iniciar una sesión hibernate");
	    Session session = sessionFactory.openSession();
	    System.out.println("Iniciar una transacción hibernate");
	    Transaction transaction = session.beginTransaction();
	    //Hibernate test
	    System.out.println("Creación de repositorio de usuarios");
	    Singleton<UserRepository> singleton = Singleton.getInstance(new UserRepository(sessionFactory, User.class));
	    UserRepository userRepository = singleton.getObject();
	    System.out.println("Creación de usuario de prueba");
	    User user = new User("test", false);
	    System.out.println("Guardar usuario");
	    userRepository.add(user);
	    System.out.println("Usuarios que existen en la bbdd");
	    for (User usr : userRepository.get()) {
			System.out.println(usr.toString());
		}
	    user.setNombre("pruebaUpdate");
	    System.out.println("Cambiado nombre del usuario a: " + user.getNombre());
	    userRepository.update(user);
	    System.out.println("Actualizado usuario en la bbdd: " + userRepository.get(user.getId()).toString());
	    userRepository.delete(user.getId());
	    System.out.println("Eliminado usuario con Id: " + user.getId());
	    System.out.println("Usuarios que existen en la bbdd");
	    for (User usr : userRepository.get()) {
			System.out.println(usr.toString());
		}	    
	    
	    sessionFactory.close();
  }
}
