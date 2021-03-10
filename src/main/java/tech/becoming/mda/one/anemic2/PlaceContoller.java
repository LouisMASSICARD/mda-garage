package tech.becoming.mda.one.anemic2;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Louis MASSICARD (user name : louis)
 * @version 
 * @since %G% - %U% (%I%)
 * 
 * Controller : liste des endpoints
 */
//@Controller
//@RequestMapping(value="/places", produces=MediaType.APPLICATION_JSON_VALUE)

@RestController
@RequestMapping(value="places")
@Slf4j
@RequiredArgsConstructor // Constructeur avec les variables "final"
public class PlaceContoller {
	/* ========================================= Attributs ============================================= */ /*=========================================*/

	private final PlaceResource placeResource;
	private final PlaceValidator validator;
    
	/* ========================================= Methodes ============================================== */ /*=========================================*/

	@GetMapping
	// @Secured 
	// l'entrée du controller sécurisé et non le service,
	// pb si on a deux endpoints pour un service,
	// alors sécurisé tous les endpoints,
	// sinon plus simple de sécurisé directement au niveau service
	// /!\ être cohérent entre tous les endpoints
	public List<PlaceEntity> findAllPlaces() {
		log.debug("Call GET /places");
		// Pas de logique métier
		return placeResource.findAll();
	}
	
	@PostMapping
//	public PlaceEntity createPlace(@RequestBody PlaceEntity placeInput) {
	public PlaceEntity createPlace(@RequestBody @Valid PlaceDTO placeInput) {
		log.debug("Call POST /places with : " + placeInput.toString());
		// Logique business : validation, création, sauvegarde, ...
		validator.validate(placeInput);
		PlaceEntity place = new PlaceEntity(UUID.randomUUID().toString(), placeInput.getNumber(), placeInput.getAlley(), false);
		return placeResource.save(place);
	}
}
