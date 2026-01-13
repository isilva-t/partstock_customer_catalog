package catalog.p40_infrastructure.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import catalog.p30_domain.model.Unit;

@Repository
public interface UnitRepository extends MongoRepository<Unit, String> {

	@Query("{ $text: { $search: ?0 } }")
	List<Unit> searchByText(String query);

	List<Unit> findAll();
}
