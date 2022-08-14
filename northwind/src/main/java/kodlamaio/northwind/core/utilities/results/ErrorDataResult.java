package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data, String message){ //Başarılı bir data sonucu dönderirsem bana data ve mesaj ver
        super(data, false,message);
    }

    public ErrorDataResult(T data){
        super(data,false);
    }

    public ErrorDataResult(String message){
        super(null,false,message);
    }

    public ErrorDataResult(){
        super(null, false);
    }
}
