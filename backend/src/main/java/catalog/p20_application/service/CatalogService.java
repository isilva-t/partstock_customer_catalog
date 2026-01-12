package catalog.p20_application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import catalog.p30_domain.model.Unit;
import catalog.p40_infrastructure.repository.UnitRepository;

@Service
public class CatalogService {

	private final UnitRepository unitRepository;

	public CatalogService(UnitRepository unitRepository) {
		this.unitRepository = unitRepository;
	}

	public List<Unit> searchUnits(String query) {
		if (query == null || query.trim().isEmpty()) {
			return List.of();
		}
		return unitRepository.searchByText(query);
	}

	public Optional<Unit> getUnitById(String id) {
		return unitRepository.findById(id);
	}

	public List<Unit> getAllUnits() {
		return unitRepository.findAll();
	}
}
