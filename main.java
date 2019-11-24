

public class main {

    public static void main(String args[]){
        helper.mult();
    }



}


class helper {

    public static void mult(){
        int x = getIntX();
        int y = getIntY();
        print(x, y);
    }

    public static void print(int a, int b){
        System.out.println(a*b);
    }

    public static int getIntX(){
        return 5;
    }

    public static int getIntY(){
        return 4;
    }
}
