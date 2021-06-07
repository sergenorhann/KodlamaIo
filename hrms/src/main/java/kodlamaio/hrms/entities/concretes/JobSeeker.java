package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name="verification_id")
	private int verificationId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="nationality_id")
	private String nationalityId;
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
}
