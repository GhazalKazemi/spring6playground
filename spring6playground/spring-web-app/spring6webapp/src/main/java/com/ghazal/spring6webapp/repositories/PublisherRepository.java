package com.ghazal.spring6webapp.repositories;

import com.ghazal.spring6webapp.entity.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
