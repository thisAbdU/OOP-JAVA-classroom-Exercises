public class AreaCalculation {

    public static void main(String[] args) {
        AreaCalculation solution = new AreaCalculation();
        System.out.println(solution.calcArea(3));
        System.out.println(AreaCalculation.calcArea(4.0, 5));
        System.out.println(AreaCalculation.calcArea(3, 5));
       
    }
    public double calcArea(double radius){
        return radius * radius * (Math.PI);
    }
    public static double calcArea(double length, double width){
        return length * width;
    }
    public static double calcArea(int length, int height){
        return length * height * 0.5;
    }

}