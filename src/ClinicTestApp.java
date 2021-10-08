package src;

public class ClinicTestApp {
    public static void main(String[] args) {
        System.out.println("Order Fancy Glasses");
        eyeBuilder EyeBuilder = new FancyGlassesBuilder();
        Clinic clinic = EyeBuilder.addEyeGlasses().addShape().addColor().build();
        clinic.setState(new Opened_Closed(clinic));
        clinic.startProcess();
        clinic.prepareGlasses();

        //Object and passing it to setState for a new State.
        clinic.setState(new Holiday(clinic));
        clinic.startProcess();
        clinic.stopProcess();

        //Object and passing it to setState for a new State.
        clinic.setState(new Doctor(clinic));
        clinic.startProcess();
        clinic.stopProcess();
        clinic.setState(new Opened_Closed(clinic));
        clinic.stopProcess();

        System.out.println();
        System.out.println("Order A New glasses");

        eyeBuilder builder = new SimpleGlassesBuilder();
        Clinic eye = builder.addEyeGlasses().addShape().addColor().addEyeSight().build();

        eye.setState(new Opened_Closed(eye));
        eye.startProcess();
        eye.prepareGlasses();

        //Object and passing it to setState for a new State.
        eye.setState(new Holiday(eye));
        eye.startProcess();
        eye.stopProcess();

        //Object and passing it to setState for a new State.
        eye.setState(new Doctor(eye));
        eye.startProcess();
        eye.stopProcess();
        eye.setState(new Opened_Closed(eye));
        eye.stopProcess();
    }
}
