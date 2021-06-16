package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Confirm;

public interface ConfirmDao extends JpaRepository<Confirm, Integer> {

}
