public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 172;       //Рост в сантиметрах
        int weight = 100;       //Вес в килограммах
        int bmi = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела равен " + bmi);
    }
}
