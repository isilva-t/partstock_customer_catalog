package catalog.p30_domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
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
	private String id; // unit.sku

	private String productSku; // product.sku

	private String title;
	private String description;
	private Double priceWithVat;
	private List<String> photos;

	// private ClassificationInfo classicication;
	// private List<CompabilityInfo> compabilities;

	public String getFullSku() {
		return productSku + "-" + id;
	}
}
