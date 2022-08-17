package maximum;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {
    public static void main(String[] args) throws Exception{
        Class cv = Vehicle.class;
        Constructor<Vehicle>[] vehicleConstructors = cv.getConstructors();
        Package cvPackage = cv.getPackage();
        Field[] fields = cv.getFields();
        Method[] methods = cv.getMethods();
        int modify = cv.getModifiers();
        String modifyText = Modifier.toString(modify);
        String simpleName = cv.getSimpleName();

        System.out.println("Info about class \"" + simpleName + "\": ");
        System.out.println("\nPackage: " + cvPackage.toString());
        System.out.println("Modify = " + modifyText);
        System.out.println("Constructors:");
        for (Constructor c : vehicleConstructors)
            System.out.println(c.toString());
        System.out.println("\nFields:");
        for (Field f : fields)
            System.out.println(f.toString());
        System.out.println("\nMethods:");
        for (Method m : methods)
            System.out.println(m.toString());

        Constructor<Vehicle> singleConstructor = cv.getConstructor(String.class, int.class);
        Vehicle newVehicle = singleConstructor.newInstance("Car", 240);
        System.out.println("\n" + newVehicle);

        Field speedField = cv.getField("maxSpeed");
        Field typeField = cv.getField("type");
        speedField.set(newVehicle, 520);
        typeField.set(newVehicle, "Plane");
        System.out.println("\n" + newVehicle);

        methods[7].invoke(newVehicle);
    }
}
