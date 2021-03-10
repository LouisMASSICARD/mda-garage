package tech.becoming.mda.one.anemic2;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Louis MASSICARD (user name : louis)
 * @version 
 * @since %G% - %U% (%I%)
 * 
 * Place Resource / Repository.
 */
public interface PlaceResource extends JpaRepository<PlaceEntity, String> {

}
