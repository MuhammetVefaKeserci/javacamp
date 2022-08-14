package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data, String message){ //Başarılı bir data sonucu dönderirsem bana data ve mesaj ver
        super(data, true,message);
    }
    public SuccessDataResult(T data){
        super(data,true);
    }

    public SuccessDataResult(String message){
        super(null,true,message);
    }

    public SuccessDataResult(){
        super(null, true);
    }
}
