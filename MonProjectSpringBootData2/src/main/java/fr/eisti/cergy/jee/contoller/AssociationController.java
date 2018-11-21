package fr.eisti.cergy.jee.contoller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.eisti.cergy.jee.model.Association;
import fr.eisti.cergy.jee.service.AssociationService;
 
@Controller("AssociationController")
public class AssociationController {
	
	private final Logger logger = LoggerFactory.getLogger(AssociationController.class);

 
	@Autowired
	AssociationService associationService;
 

@RequestMapping(value = "/association/listAll", method = RequestMethod.GET)
	protected ModelAndView showAllAssociations() throws Exception {
		/*
		 * Lancement du Service et recupeation donnees en base
		 */
		List<Association> listeAssociations = associationService.getAll();

		/*
		 * Envoi Vue + Modele MVC pour Affichage donnees vue
		 */
		return new ModelAndView("/association/showAllAssociations", "associations", listeAssociations);
	}

	 	@RequestMapping(value = "/association/list", method = RequestMethod.GET)
	    public String list(Model model) throws Exception {
	        model.addAttribute("associations", associationService.getAll());
	        return "/association/showAllAssociations"; // Afficher la page showAllProduits.jsp qui se trouve sous /produit
	        
	    }

	    @RequestMapping(value = "/association/get/{id}" , method = RequestMethod.GET)
	    public String get(@PathVariable Long id, Model model) throws Exception {
	        model.addAttribute("associationToShow", associationService.getByIdAssociation(id));
	        return "/association/showAssociation"; // Afficher la page showProduit.jsp qui se trouve sous /produit
	    }
	    
	    
	    @RequestMapping(value = "/association/save", method = RequestMethod.POST)
	    public String saveOrUpdate(@ModelAttribute("associationForm") Association association, Model model, final RedirectAttributes redirectAttributes) throws Exception {
	    	try {
				
			
			Long idAssociation = associationService.save(association);

	    	
	    	if(  association.getIdAssociation()!=null){
				redirectAttributes.addFlashAttribute("typeAlert", "info");
		    	redirectAttributes.addFlashAttribute("msgAlert", "Produit dont ID : "+association.getIdAssociation()+" a été mis à jour.");

			}else{
				redirectAttributes.addFlashAttribute("typeAlert", "success");
		    	redirectAttributes.addFlashAttribute("msgAlert", "Nouveau Produit a été enregsitrée avec ID : "+idAssociation);
			}
	    	
	    	} catch (Exception e) {
				e.printStackTrace();
			}
	        return "redirect:/association/listAll";
	    }
	    

 
	    @RequestMapping("/association/update/{id}")
	    public String update(@PathVariable Long id, Model model, final RedirectAttributes redirectAttributes) throws Exception {
	    	Association association = associationService.getByIdAssociation(id);
	        model.addAttribute("associationForm", association);
	        return "/association/addUpdateAssociation";
	    }
 
}
