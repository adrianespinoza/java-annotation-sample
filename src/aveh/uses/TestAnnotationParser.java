package aveh.uses;

import java.lang.reflect.Method;

import aveh.annotations.Test;

public class TestAnnotationParser {
    public void parse(Class clazz) throws Exception {
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                String info = test.info();

                if ("AWESOME".equals(info)) {
                    System.out.println("info is awesome!");
                    // try to invoke the method with param
                    //Class.forName("aveh.uses.Annotated").newInstance();
                    //Annotated.class.newInstance();
                    method.invoke(
                        //Annotated.class.newInstance(),
                        Class.forName("aveh.uses.Annotated").newInstance(),
                        info
                    );
                }
            }
        }
    }
    public void parse2(Object clazz) throws Exception {
        Method[] methods = clazz.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                String info = test.info();

                if ("AWESOME".equals(info)) {
                    System.out.println("info is awesome!");
                    // try to invoke the method with param
                    method.invoke(
                        clazz,
                        info
                    );
                }
            }
        }
    }
}
