package fr.eisti.cergy.jee.service;

import java.util.List;

import fr.eisti.cergy.jee.model.Association;


public interface AssociationService {

	public Long save (Association association) throws Exception ;
	
	List<Association> getAll();
 
	Association getByIdAssociation(Long idAssociation) throws Exception;
	
	int updateIdAssociation(Long idAssociation);
	
  	int updateNomAssociation (String nomAssociation, Long idAssociation); 

   
}
