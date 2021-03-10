package tech.becoming.mda.one.anemic2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Louis MASSICARD (user name : louis)
 * @version 
 * @since %G% - %U% (%I%)
 * 
 * A place for our garage.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaceEntity implements Serializable {
	/* ========================================= Global ================================================ */ /*=========================================*/

	/**
	 * Random serial version.
	 */
	private static final long serialVersionUID = 5317908270809288749L;
	
	/* ========================================= Attributs ============================================= */ /*=========================================*/

    @Id
    private String id;
    
    private String number;
    
    @Column(unique = true)
    private String alley;
    
    private boolean used;
		
	/* ========================================= Constructeurs ========================================= */ /*=========================================*/
    // Lombok

	/* ========================================= Accesseurs ============================================ */ /*=========================================*/
    // Lombok
}
