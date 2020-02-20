package java2;

public class CustomException  extends Exception{
    public CustomException(String message){
//        super(message,null,true,true);
        super(message,null,true,false);

    }


}
class Test{
    public static void main(String[] args)  {
        Test test= new Test();
        try{
            test.getUser();
        }
        catch(CustomException ex){
            System.out.println("custom exception no stack trace.......");
            ex.printStackTrace();
        }
    }
    String getUser() throws CustomException{

        throw new CustomException("Custom Exception found");
    }

}
