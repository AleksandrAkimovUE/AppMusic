package umu.tds.apps.AppMusic.model;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import umu.tds.apps.AppMusic.NotImplementedExcepcion;

@Entity
public class User implements Comparable<User>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String login;
	private String password;
	private String name;
	private boolean premium;
	private Date birthDate;
	private Set<PlayList> playLists;
	private Discount discount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return name;
	}

	public void setNombre(String nombre) {
		this.name = nombre;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public PlayList getPlayList(int id) throws Exception{
		throw new NotImplementedExcepcion();
	}

	public User() {
		
	}

	public User(String nombre, boolean premium) {
		this.name = nombre;
		this.premium = premium;
	}
	
	public void addSongToPlayList(Song song, PlayList playList) throws Exception{
		throw new NotImplementedExcepcion();
	}
	
	public void removeSongFromPlayList(int  id, PlayList playList) throws Exception
	{
		throw new NotImplementedExcepcion();
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, login);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(login, other.login);
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
		return "User [id=" + id + ", nombre=" + name + ", premium=" + premium + "]";
	}
}
