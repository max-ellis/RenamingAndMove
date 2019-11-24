

public class main {

    public static void main(String args[]){
        mult();
    }

    private static void mult(){
	helper h = new helper();
        int x = h.getIntX();
        int y = h.getIntY();
        print(x, y);
    }


    private static void print(int a, int b){
        System.out.println(a*b);
    }


}


class helper {

    public static int getIntX(){
        return 5;
    }

    public static int getIntY(){
        return 4;
    }
}
