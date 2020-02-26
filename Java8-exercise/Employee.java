interface Messageable{
    Message getDetails(int id, String name, int Age);
}


    class Message{
        public int id;
        public String name;
        public int Age;
        Message(int id, String name,int Age){
            System.out.print(id+" "+name+" " +Age);
        }
    }
public class Employee {
        public static void main(String[] args) {
            Messageable hello = Message::new;
            hello.getDetails(1,"Priyanka",22);
        }
}

