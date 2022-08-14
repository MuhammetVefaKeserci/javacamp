package kodlamaio.northwind.core.utilities.results;

public class Result { //super type olarak geçer bu result
    private boolean success; // DEĞİŞKENLER
    private String message;  // DEĞİŞKENLER

    public Result(boolean success){ //CONSTRUCTOR
        this.success = success;
                                  }

    public Result(boolean success,String message){ //CONSTRUCTOR == Obje oluşturulurken değer verilmesidir
        this(success);
        this.message = message;
    }


     public boolean isSuccess()  { //GETTER
        return this.success;
     }

     public String getMessage(){ //GETTER
        return this.message;
     }
}
