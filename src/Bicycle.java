public class Bicycle extends WheelTransport {
    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
