public class Point {
    public double oringinalX;
    public double oringinaly;

    Point(double x1, double y2){
       this.oringinalX = x1;
       this.oringinaly = y2;
    }

    public double distance(double x, double y){
        double distance = Math.pow(Math.pow(oringinalX - x, 2) + Math.pow(oringinaly - y, 2), 0.5);
        return distance;
    }


}