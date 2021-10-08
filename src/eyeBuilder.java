package src;

import java.util.ArrayList;
import java.util.List;

public abstract class eyeBuilder {
    String name;
    List<String> glasses = new ArrayList<String>();

    public abstract eyeBuilder addEyeGlasses();
    public abstract eyeBuilder addShape();
    public abstract eyeBuilder addColor();
    public abstract eyeBuilder addEyeSight();

    public Clinic build() {
        Clinic eye = new Clinic();
        eye.setName(this.name);
        eye.Eye(glasses);
        return eye;
    }
}

