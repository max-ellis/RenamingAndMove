

public class main {

    public static void main(String args[]){
        mult();
    }

    private static int getIntX(){
        return 5;
    }

    private static int getIntY(){
        return 4;
    }

    private static void print(int a, int b){
        System.out.println(a*b);
    }

    private static void mult(){
        int x = getIntX();
        int y = getIntY();
	x=x*x;
        print(x, y);
    }

}
