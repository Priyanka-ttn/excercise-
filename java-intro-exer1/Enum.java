package javaintro;

public class Enum {

    private class Test{

    }

        enum House{

            House1(20),House2(25),House3(53);
            void getPrice(){
                System.out.println(20);
            }


            private int value;
            House(int value){
                this.value=value;
            }


        }

        public static void main(String args[]){
            House h = House.House1;
            System.out.println(h);
            h.getPrice();
            for (House h1: House.values())
                  {
                      System.out.println(h1 +" " +h1.value);

            }




        }
}
