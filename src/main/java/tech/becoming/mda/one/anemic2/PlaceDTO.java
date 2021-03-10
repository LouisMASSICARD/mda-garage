package tech.becoming.mda.one.anemic2;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Louis MASSICARD (user name : louis)
 * @version 
 * @since %G% - %U% (%I%)
 * 
 * Place DTO use to check Place constraints in inputs during POST, PUT...
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaceDTO {
	/* ========================================= Attributs ============================================= */ /*=========================================*/

	@NotNull
	@NotBlank
    private String number;
	
	@NotNull
	@NotBlank
    private String alley;
}
