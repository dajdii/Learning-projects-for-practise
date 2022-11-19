public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        int xA = this.x;
        int yA = this.y;

        int xB = 0;
        int yB = 0;
        double result=0;

        result = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));

        return result;
    }

     public double distance(int x, int y){

        int xA = this.x;
        int yA = this.y;

        int xB = x;
        int yB = y;
        double result=0;

        result = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));

        return result;

    }

    public double distance(Point point){

        int xA = this.x;
        int yA = this.y;

        int xB = point.x;
        int yB = point.y;
        double result=0;

        result = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));

        return result;
    }
}
