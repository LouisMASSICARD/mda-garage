package tech.becoming.mda.one.anemic2;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.springframework.stereotype.Service;

/**
 * @author Louis MASSICARD (user name : louis)
 * @version 
 * @since %G% - %U% (%I%)
 * 
 * Validator to check Place DTO constraints.
 */
@Service
public class PlaceValidator {
	/* ========================================= Global ================================================ */ /*=========================================*/

	/* ========================================= Attributs ============================================= */ /*=========================================*/

	private Validator validator;
	
	/* ========================================= Constructeurs ========================================= */ /*=========================================*/

	PlaceValidator(Validator validator) {
		this.validator = validator;
	}
	  
	/* ========================================= Methodes ============================================== */ /*=========================================*/

	  public void validate(PlaceDTO place) {
	    Set<ConstraintViolation<PlaceDTO>> violations = validator.validate(place);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }
	  
	/* ========================================= Accesseurs ============================================ */ /*=========================================*/

	/* ========================================= Main ================================================== */ /*=========================================*/
}
