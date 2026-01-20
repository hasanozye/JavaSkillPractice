package day13;

public class ThisKeyword {
    int x, y;


    void setData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    ThisKeyword(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x + "    " + y);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(10,20);
//        thisKeyword.setData(10, 20);
        thisKeyword.display();

    }
}
