public class Main {

    public static void main(String[] args) {
        double  width;
        double  length;
        double  perimeter;
        double  area;

        width = 10.5;
        length = 17.3;
        perimeter = (length + width) * 2;
        area = length * width;
        System.out.println("Umfang: " + perimeter);
        System.out.println("Fläche: " + area);
    }
}
