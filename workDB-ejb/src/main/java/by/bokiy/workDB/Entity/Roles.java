package by.bokiy.workDB.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Roles {
	@Id
	@SequenceGenerator(name = "RSEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RSEQ")
	private long id;
	private String role;
	public long getId() {
		return id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
