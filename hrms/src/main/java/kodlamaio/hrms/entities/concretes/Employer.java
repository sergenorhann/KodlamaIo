package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisements"})
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")

public class Employer extends User{


	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website")
	private String website;	
	
	@Column(name="phone_number")
	private String phoneNumber;
	
//	@Column(name="verification_id")
//	private int verificationId;
//	
//	@Column(name="confirm_id")
//	private int confirmId;
	
	//@OneToMany(mappedBy = "employer")
	//private List<JobAdvertisement> jobAdvertisements;
	
}
