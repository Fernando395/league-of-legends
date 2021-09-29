package org.example.league_of_legends.repository;

import org.example.league_of_legends.model.Champion;
import org.springframework.data.repository.CrudRepository;

public interface DataBaseRepository extends CrudRepository<Champion, Integer> {
}
