package coffeeshop;

public class Barista extends Cashier{
    @Override
    public void orderQueue() {
        super.orderQueue();
    }

    public void prepareCoffee(){
        ///...........order prepared
    }

    public void raiseNotification(){
        ////........message
        /////pending order - prepared order
    }
}
