	package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int _id;
	@Column(name="email")
	private String _eMail;
	@Column(name="password")
	private String _password;
	@Column(name="job_position_id")
	private int _jobPositionId;

	
	public User()
	{
		
	}
	
	public User(int id, String eMail, String password, int jobPositionId) {
		super();
		_id = id;
		_eMail = eMail;
		_password = password;
		_jobPositionId = jobPositionId;
	}

}