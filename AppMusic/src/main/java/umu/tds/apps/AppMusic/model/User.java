package umu.tds.apps.AppMusic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Comparable<User>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private boolean premium;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public User() {
		
	}

	public User(String nombre, boolean premium) {
		this.nombre = nombre;
		this.premium = premium;
	}
	
	@Override
	public int compareTo(User otroUsuario)
	{
		if(this.id < otroUsuario.id)
		{
			return -1;
		}
		else if(this.id > otroUsuario.id)
		{
			return 1;
		}
		else {
			return 0;
		}
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", premium=" + premium + "]";
	}
}
