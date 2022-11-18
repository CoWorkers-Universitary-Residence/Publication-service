package pe.edu.coworkers.publicationservice.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.coworkers.publicationservice.model.UserOwner;

public interface UserOwnerClient {
    @GetMapping( "/api/v1/usersowner/{id}")
    public ResponseEntity<UserOwner> getAOwnerById(@PathVariable Long id);
}
