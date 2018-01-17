package aveh.main;

import aveh.uses.Annotated;
import aveh.uses.TestAnnotationParser;

public class Demo {
    public static void main(String[] args) throws Exception {
        TestAnnotationParser parser = new TestAnnotationParser();
        //parser.parse(Annotated.class);

        //other test
        Annotated oo = new Annotated();
        parser.parse2(oo);
    }
}
