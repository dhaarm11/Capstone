package Vamos.Vamos.models.data;

import Vamos.Vamos.models.Follower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface FollowerDao  extends CrudRepository<Follower, Integer> {
}
