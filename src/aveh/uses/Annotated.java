package aveh.uses;

import aveh.annotations.Test;

public class Annotated {
    @Test(info = "AWESOME")
    public void foo(String myParam) {
        System.out.println("This is " + myParam);
    }
}
