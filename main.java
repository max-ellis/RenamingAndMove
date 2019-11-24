

public class main {

    public static void main(String args[]){
        helper.mult();
    }


}


class helper {

    public static void mult(){
        int x = getX();
        int y = getY();
	x = x*x;
        graph(x, y);
    }

    public static void graph(int a, int b){
        System.out.println(a*b);
    }

    public static int getX(){
        return 5;
    }

    public static int getY(){
        return 4;
    }
}
