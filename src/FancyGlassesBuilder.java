package src;

public class FancyGlassesBuilder extends eyeBuilder{
    public FancyGlassesBuilder() {
        this.name = "Fancy Glasses";
    }

    @Override
    public eyeBuilder addEyeGlasses() {
        this.glasses.add("Sun Glasses");
        return this;
    }

    @Override
    public eyeBuilder addShape() {
        this.glasses.add("Circle");
        return this;
    }

    @Override
    public eyeBuilder addColor() {
        this.glasses.add("Black");
        return this;
    }

    @Override
    public eyeBuilder addEyeSight() {
        return this;
    }

}

