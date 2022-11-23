package pe.edu.coworkers.publicationservice.controllers;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.coworkers.publicationservice.entities.Photo;
import pe.edu.coworkers.publicationservice.services.PhotoService;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@Tag(name = "Publications / Photos")
@RestController
@RequestMapping("api/v1/publications/{publicationId}/photos")
public class PublicationPhotoController {
    @Autowired
    private PhotoService photoService;

    @PostMapping
    public Photo createPhoto(@RequestBody Photo photo, @PathVariable Long publicationId){
        return photoService.create(photo, publicationId);
    }
    @GetMapping
    public List<Photo> getPhotosByPublicationId(@PathVariable Long publicationId){
        return photoService.findByPublicationId(publicationId);
    }
}
