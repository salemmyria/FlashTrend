package fr.eisti.cergy.jee.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.eisti.cergy.jee.model.Association;



@Service
@Transactional
public class AssociationServiceImpl implements AssociationService{


	@Autowired
	private AssociationRepository associationRepository;

	
	@Override
	public  Association getByIdAssociation(Long idAssociation) throws Exception {
        return  (Association) associationRepository.findByIdAssociation(idAssociation);

	}

 
	@Override
	public Long save(Association association) throws Exception {
		
		association= associationRepository.save(association);
		return association.getIdAssociation();
	}




	 

	@Override
	public int updateIdAssociation(Long idAssociation) {
		return associationRepository.updateIdAssociation(idAssociation);
	}

	@Override
	public int updateNomAssociation(String nomAssociation, Long idAssociation) {
		return associationRepository.updateNomAssociation(nomAssociation, idAssociation) ;

	}




	@Override
	public List<Association> getAll() {
 		return (List<Association>) associationRepository.findAll() ;
	}

	 

   
}
