package catalog.p10_api.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UnitDTO {

	private String id;
	private String title;
	private String completeSearchText;
	private String productTitleRef;
	private String productDescription;
	private String unitAlternativeSku;
	private String unitKm;
	private String productCompatibilities;
	private Double priceWithVat;
	private List<String> photos;
}
