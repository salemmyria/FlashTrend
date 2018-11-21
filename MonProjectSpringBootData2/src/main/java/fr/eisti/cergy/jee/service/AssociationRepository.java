package fr.eisti.cergy.jee.service;
 

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import fr.eisti.cergy.jee.model.Association;



 

 
 
public interface AssociationRepository extends Repository <Association, Long>{
	
 
	Association findByIdAssociation(long idAssociation);
	
	 
	List<Association> findAll();
	
	Association save (Association association);
	 
	@Modifying
	@Query("update Association u set u.idAssociation = ?1")
	int updateIdAssociation(long idAssociation);
	
	@Modifying
	@Query("update Association u set u.nomAssociation= ?1where u.idAssociation= ?2")
	int updateNomAssociation(String nomAssociation,  Long idAssociation);

}