package by.bokiy.workDB.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user")

public class User {
	User(){}
	@Id
	@SequenceGenerator(name = "USEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USEQ")
	private  long id;
	private String name;
	private String password;
	@Column(name  = "idrole")
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id")
	private long  idRole;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

}
