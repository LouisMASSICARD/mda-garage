package tech.becoming.mda.one.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Louis MASSICARD (user name : louis)
 * @version 
 * @since %G% - %U% (%I%)
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Garage {

	/* ========================================= Global ================================================ */ /*=========================================*/

	/* ========================================= Attributs ============================================= */ /*=========================================*/
	
	@Id
	private String id;
	
	private Gate gate;
	
	@Column(unique = true)
	private String name;
	
	private Owner owner;
	
	/* ========================================= Constructeurs ========================================= */ /*=========================================*/

	/* ========================================= Methodes ============================================== */ /*=========================================*/

	/* ========================================= Accesseurs ============================================ */ /*=========================================*/

	/* ========================================= Main ================================================== */ /*=========================================*/

}
