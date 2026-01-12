package catalog.p30_domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;

@Document(collection = "units")
@Getter
@Setter
@NoArgsConstructor
public class Unit {

	@Id
	private String id; // sku VI3-26A77

	@Indexed
	private String completeSearchText; // pre concatenated by on permise

	private String title; // pre-concatenated by on-permise
	private Double priceWithVat;

	// optional fields allways
	private String productTitleRef;
	private String productDescription;
	private String unitAlternativeSku;
	private String unitKm;
	private String productCompatibilities;

	// in frontend, will show a template photo if this empty
	private List<String> photos;

	// private ClassificationInfo classicication;
	// private List<CompabilityInfo> compabilities;

}
