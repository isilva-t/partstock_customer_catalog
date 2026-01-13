package catalog.p10_api.controller;

import org.springframework.web.bind.annotation.*;

import catalog.p10_api.dto.UnitDTO;
import catalog.p20_application.mapper.UnitMapper;
import catalog.p20_application.service.CatalogService;
import catalog.p30_domain.model.Unit;

import java.util.Map;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class SearchController {

	private final CatalogService catalogService;
	private final UnitMapper unitMapper;

	public SearchController(
			CatalogService catalogService,
			UnitMapper unitMapper) {
		this.catalogService = catalogService;
		this.unitMapper = unitMapper;
	}

	@GetMapping("/search")
	public List<UnitDTO> search(@RequestParam String q) {
		List<Unit> units = catalogService.searchUnits(q);
		return unitMapper.toDTOList(units);
	}

	@GetMapping("/unit/{id}")
	public UnitDTO getUnit(@PathVariable String id) {
		Unit unit = catalogService.getUnitById(id)
				.orElse(null);
		return unitMapper.toDTO(unit);
	}

}
