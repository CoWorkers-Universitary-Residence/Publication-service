package pe.edu.coworkers.publicationservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.coworkers.publicationservice.entities.Publication;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
    List<Publication> findAllByOwnerId(Long ownerId);

}
