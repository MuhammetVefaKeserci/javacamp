package kodlamaio.northwind.entities.concretes;

import lombok.*;

import javax.persistence.*;



@Data
@Entity
@Table(name = "products")
@AllArgsConstructor //Bütün parametreleri kullanarak Constructorları oluştur yani parametreli constructor oluştur
@NoArgsConstructor  //Parametresiz Constructor oluştur. NOT:Ekstradan yazmana gerek kalmıyor Aşağıdaki gibi.NOT:Hiç parametre olmadan ben direk Product new diyebileyim. Sonrasında istersem alanları kendim veririm anlamında


public class Product {

    @Id //Bu bunun İd alanı olduğu yani primary key alanı olduğunu verir
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Bu id nin nasıl oluşacağını
    @Column(name = "product_id") //Bu hangi alana karşı geldiğini
    private int id;

    //@Column(name = "category_id")
    //private int categoryId;

    @Column(name = "product_name") //Bunlar hangi kolona karşılık geldiği
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short  unitsInStock;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    @ManyToOne() //Burda ise ilişkili olduğu tabloyla ilişkisinin nasıl olduğu yönünde bir kod çalışması
    @JoinColumn(name ="category_id")  //Burdaki Product Join olmaya çalışıyor. Category'nin Productla ilgili hiçbir bilgisi yok. Biz join'i category_id ile yapıyoruz.
    private Category category;  //Bir ürünün(Product'ın) bir category si var. Dolayısıyla liste şeklinde yazmayız biz bunu.
                                //Bunlar Product'ın özellikleri olduğu için Category tipinde bir özelliği olacak.
                                //Category i burda kullanmak için bir instanceını oluşturduk. Liste şeklinde oluşturmadık çünkü tek bir tane category var.



}
