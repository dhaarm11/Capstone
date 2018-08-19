package Vamos.Vamos.models.data;

import Vamos.Vamos.models.Trip;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface TripDao extends CrudRepository<Trip, Integer> {
}
