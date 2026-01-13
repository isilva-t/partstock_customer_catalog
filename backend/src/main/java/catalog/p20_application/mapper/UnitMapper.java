package catalog.p20_application.mapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import catalog.p10_api.dto.UnitDTO;
import catalog.p30_domain.model.Unit;

@Component
public class UnitMapper {

	public UnitDTO toDTO(Unit unit) {
		if (unit == null) {
			return null;
		}

		UnitDTO dto = new UnitDTO();
		dto.setId(unit.getId());
		dto.setTitle(unit.getTitle());
		dto.setCompleteSearchText(unit.getCompleteSearchText());
		dto.setProductTitleRef(unit.getProductTitleRef());
		dto.setProductDescription(unit.getProductDescription());
		dto.setUnitAlternativeSku(unit.getUnitAlternativeSku());
		dto.setUnitKm(unit.getUnitKm());
		dto.setProductCompatibilities(unit.getProductCompatibilities());
		dto.setPriceWithVat(unit.getPriceWithVat());
		dto.setPhotos(unit.getPhotos());

		return dto;
	}

	public List<UnitDTO> toDTOList(List<Unit> units) {
		if (units == null) {
			return List.of();
		}

		return units.stream()
				.map(unit -> this.toDTO(unit))
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
	}
}
