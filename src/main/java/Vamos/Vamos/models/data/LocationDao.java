package Vamos.Vamos.models.data;

import Vamos.Vamos.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface LocationDao extends CrudRepository<Location, Integer> {
    List<Location> findAllByCity(String city);
    List<Location> findAllByClassification(String classification);
    List<Location> findAllBySubcategory (String subcategory);
}
