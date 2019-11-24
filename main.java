

public class main {

    public static void main(String args[]){
        mult();
    }

    private static void mult(){
	helper h = new helper();
        int x = h.getX();
        int y = h.getY();
        print(x, y);
    }


    private static void print(int a, int b){
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
