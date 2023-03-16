package com.boulderingbaddies.tsabackend;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "terminals", path = "terminal")
public interface TerminalRepository extends PagingAndSortingRepository<Terminal, Long>, CrudRepository<Terminal,Long> {

    List<Terminal> findByCombinedCode(@Param("combinedCode") String combinedCode);

}