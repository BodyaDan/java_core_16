package maximum;

public class Vehicle {
    public String type;
    public int maxSpeed;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void MyMethod() {
        System.out.println("Congratulations u activated method by reflex");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;

        Vehicle vehicle = (Vehicle) o;

        if (maxSpeed != vehicle.maxSpeed) return false;
        return type.equals(vehicle.type);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }
}
