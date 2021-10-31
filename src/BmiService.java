public class BmiService {
    public int calculate(int height, int weight) {
        int index = weight * 100 * 100 / (height * height);
        return (index);
    }
}
