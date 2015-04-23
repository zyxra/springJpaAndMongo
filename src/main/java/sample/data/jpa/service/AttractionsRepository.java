package sample.data.jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.jpa.domain.Attractions;

@RepositoryRestResource(collectionResourceRel = "attaction", path = "attractions")
public interface AttractionsRepository extends PagingAndSortingRepository<Attractions, Long> {

	public Attractions findByDescription(@Param("description") String description);

}