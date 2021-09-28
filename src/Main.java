public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double massIndex = service.calculate(77, 1.70); // Вес писать в килограммах, рост в метрах!!!
        System.out.println("Индекс массы: " + massIndex);
    }
}
