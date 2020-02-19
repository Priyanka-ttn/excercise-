package javaintro;

public abstract class Bank {
    void getDetails(){
        System.out.println("name: ");
        System.out.println("rateofInterest: ");
        System.out.println("type: ");
    }
}
class  SBI extends Bank{
    void getDetails(){
        System.out.println("name: SBI ");
        System.out.println("rateofInterest: 4%");
        System.out.println("type: A ");
    }
}
class BOI extends Bank{
    void getDetails(){
        System.out.println("name: BOI ");
        System.out.println("rateofInterest: 5% ");
        System.out.println("type: C ");
    }
}
class ICIC extends Bank{
    void getDetails(){
        System.out.println("name: ICIC ");
        System.out.println("rateofInterest: 7% ");
        System.out.println("type: A ");
    }
}
class Test{
    public static void main(String[] args) {
        SBI s = new SBI();
        BOI b = new BOI();
        ICIC i = new ICIC();
         s.getDetails();
         b.getDetails();
         i.getDetails();
    }
}