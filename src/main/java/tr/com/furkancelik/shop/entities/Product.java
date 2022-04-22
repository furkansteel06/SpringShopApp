package tr.com.furkancelik.shop.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "model")
	private String model;

	@Column(name = "price")
	private int price;

}
