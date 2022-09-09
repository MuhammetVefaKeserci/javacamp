package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Category;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService  productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }
    @PostMapping("/add") //Map etme eşleştirme demektir.
    public Result add(@RequestBody Product product){ //RequestBody mantığı ekranda değerleri gir json data olarak gönder
        return this.productService.add(product); //product service de ki add operasyonunu şu product a ekle
    }
    @GetMapping("/getByProductName") //getByProductName ===> Endpoint isimlendirme ==> BU ENDPOİNT DE BİR İSTEK YAPILACAK
    public DataResult<Product> getByProductName(@RequestParam String productName){  //Komple bu bizim kullanıcıdan aldığımız bilgi yani yapılan istek. @RequestParam ==> parametre olarak gönderecek. Yani aypılan isteğin parametrelerine bak orda productName diye bir şey olacak onu oku.
        return this.productService.getByProductName(productName);
    }
    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName, @RequestParam int categoryId){
        return this.productService.getByProductNameAndCategoryId(productName,categoryId);
    }

    @GetMapping("getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
        return this.productService.getByProductNameContains(productName);
    }
    @GetMapping("getAllByPage")
    public DataResult<List<Product>> getAll(int pageNo, int pageSize){
        return this.productService.getAll(pageNo,pageSize);
    }
    @GetMapping("getAllDesc")
    public  DataResult<List<Product>> getAllSorted() {
        return this.productService.getAllSorted();
    }

    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithDetails(){
        return this.productService.getProductWithCategoryDetails();
    }
}
