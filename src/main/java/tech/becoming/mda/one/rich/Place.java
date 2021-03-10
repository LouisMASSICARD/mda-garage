package tech.becoming.mda.one.rich;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Louis MASSICARD (user name : louis)
 * @version 
 * @since %G% - %U% (%I%)
 * 
 * 
 */
@Entity
@Getter
@Setter

@Builder
@NoArgsConstructor
@AllArgsConstructor

@RestController
@RequestMapping(value = "places")
public class Place implements CrudRepository<Place, Long>, Serializable {
	/* ========================================= Global ================================================ */ /*=========================================*/
	
	private static final long serialVersionUID = -6862727921126472836L;

	/* ========================================= Attributs ============================================= */ /*=========================================*/
	
	@Id
    @GeneratedValue
    private Long id;

    @Column
    @JoinColumn
    private String password;
    
	/* ========================================= Constructeurs ========================================= */ /*=========================================*/
    // Lombok
    
    /* ========================================= Internal classes ========================================= */ /*=========================================*/

    @Getter
    @AllArgsConstructor
    private class NewPlaceDTO {
    	private String password;
    }
    
    @Getter
    @AllArgsConstructor
    private class PlaceDTO {
    	private Long id;
    }
    
    @NoArgsConstructor
    public class ValidationHelper {
        public void validate(NewPlaceDTO place) {

        }
    }
    
    @NoArgsConstructor
    public class PlaceMapper {
        public Place toEntity(NewPlaceDTO dto) {
            return Place
                    .builder()
                    .password(dto.getPassword())
                    .build();
        }

        public PlaceDTO toDto(Place saved) {
            return new PlaceDTO(saved.getId());
        }
    }    
    
	/* ========================================= Methodes ============================================== */ /*=========================================*/

    @GetMapping
    public Iterable<Place> findAllPlace() {
        return findAll();
    }

    @PostMapping
    public PlaceDTO createPlace(NewPlaceDTO dto) {
    	ValidationHelper validationHelper = new ValidationHelper();
    	validationHelper.validate(dto);
    	
    	PlaceMapper mapper = new PlaceMapper();
        var place = mapper.toEntity(dto);

        final var saved = save(place);

        return mapper.toDto(saved);
    }
    
    /* ========================================= CrudRepository ============================================== */ /*=========================================*/

	@Override
	public <S extends Place> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Place> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Place> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Place> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Place> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Place entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Place> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	/* ========================================= Accesseurs ============================================ */ /*=========================================*/
	// Lombok
	/* ========================================= Main ================================================== */ /*=========================================*/
}
