public class Triangle {
    public double a;
    public double b;
    public double c;

    public double areaTriangulo(){

        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void showHigest(double x, double y){

        System.out.printf("Triangle X area: %.4f%n", x);
        System.out.printf("Triangle X area: %.4f%n", y);

        if(x > y){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
    }
}
