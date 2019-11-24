

public class main {

    public static void main(String args[]){
        mult();
    }

    private static void mult(){
	helper h = new helper();
        int x = h.getX();
        int y = h.getY();
	x = x*x;
        graph(x, y);
    }


    private static void graph(int a, int b){
        System.out.println(a*b);
    }


}


class helper {

    public static int getX(){
        return 5;
    }

    public static int getY(){
        return 4;
    }
}
