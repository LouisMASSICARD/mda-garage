package tech.becoming.mda.one.entity;

import java.util.List;

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
public class Gate {

	/* ========================================= Global ================================================ */ /*=========================================*/

	/* ========================================= Attributs ============================================= */ /*=========================================*/

	@Id
	private String id;

	private List<Lock> lock;
	
	private Motor motor;
	
	/* ========================================= Constructeurs ========================================= */ /*=========================================*/

	/* ========================================= Methodes ============================================== */ /*=========================================*/

	/* ========================================= Accesseurs ============================================ */ /*=========================================*/

	/* ========================================= Main ================================================== */ /*=========================================*/

}
