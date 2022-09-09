package kodlamaio.northwind.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Category {
    @Id
    @Column(name ="category_id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(mappedBy = "category") //mappedBy ==>categories tablosuyla ilişkilendirin. ANA tablomuz categories.
    private List<Product> products; //Bu bizim  tablomuz. Bir category nin Birçok ürünü var dolayısıyla liste şeklinde yazdık.
                                //Burda da category'nin instance'ını oluşturduk. Ama liste şeklinde çünkü bir Product(ürün) var













}
