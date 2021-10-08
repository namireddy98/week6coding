package src;

public class SimpleGlassesBuilder extends eyeBuilder{
    public SimpleGlassesBuilder() {
        this.name = "Simple Glasses";
    }

    @Override
    public eyeBuilder addEyeGlasses() {
        this.glasses.add("EyeSight Glasses");
        return this;
    }

    @Override
    public eyeBuilder addShape() {
        this.glasses.add("Oval");
        return this;
    }

    @Override
    public eyeBuilder addColor() {
        this.glasses.add("Red");
        return this;
    }

    @Override
    public eyeBuilder addEyeSight() {
        this.glasses.add("0.75");
        return this;
    }

}
