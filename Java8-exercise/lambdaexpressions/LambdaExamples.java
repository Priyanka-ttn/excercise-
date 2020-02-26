package lambdaexpressions;

public class LambdaExamples {
    interface Compare{
        boolean display(int i, int j);
    }
    interface Increment{
        int display(int i);
    }
    interface Concat{
        String display(String i, String j);
    }
    interface Upper{
        String display(String i);
    }

    public static void main(String[] args) {
        Compare  com = (int i,int j)->{
           if(i>j){
               return true;
           }
            return false;
        };
        Increment inc = (int i)->{
            int j = i+1;
            return j;
        };
        Concat con = (String i,String j)->{

            return i+j;
        };
        Upper upper = (String i)->{

            return i.toUpperCase();
        };
        System.out.println("Compare : "+com.display(9,8));
        System.out.println("Incrememt : "+inc.display(9));
        System.out.println("Conact : "+con.display("pri","yanka"));
        System.out.println("Uppercase : "+upper.display("priyanka"));
    }
}
