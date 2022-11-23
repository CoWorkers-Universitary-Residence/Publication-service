package pe.edu.coworkers.publicationservice.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.coworkers.publicationservice.entities.Detail;
import pe.edu.coworkers.publicationservice.services.DetailService;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@Tag(name = "Publication / Details")
@RestController
@RequestMapping("api/v1/publications/{publicationId}/details")
public class PublicationDetailController {
    @Autowired
    private DetailService detailService;

    @PostMapping
    public Detail createDetail(@RequestBody Detail detail, @PathVariable Long publicationId){
        return detailService.create(detail ,publicationId);
    }
    @GetMapping
    public List<Detail> getDetailByPublicationId(@PathVariable Long publicationId){
        return detailService.findByPublicationId(publicationId);
    }
}
