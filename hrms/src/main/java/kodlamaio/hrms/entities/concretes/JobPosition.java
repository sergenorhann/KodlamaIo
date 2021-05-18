package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="job_positions")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int _id;
	
	@Column(name="name")
	private String _name;	
	
	public JobPosition() {
		
	}
	
	public JobPosition(int id, String name) {
		super();
		_id = id;
		_name = name;
	}
}
