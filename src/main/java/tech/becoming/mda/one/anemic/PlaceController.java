package tech.becoming.mda.one.anemic;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "places")
@RequiredArgsConstructor
public class PlaceController {

    private final PlaceService service;

    @GetMapping
    // @Secured
    public Iterable<Place> findAllPlace() {
        return service.findAll();
    }

    @PostMapping
    public PlaceDTO createPlace(NewPlaceDTO place) {
        return service.save(place);
    }

}
