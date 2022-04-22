package tr.com.furkancelik.shop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "shop", name = "product_detail")
public class ProductDetails extends BaseEntity {
	
}
