package mala.ocp.ch2;

/**
 *  static nested and innner classes
 */
public class Outer {

    class Inner{

    }

    static class StaticNested{

    }


    void foo(){
        //local inner
        class LocalInner{}
    }

    static void staticFoo(){
        //local inner
        class LocalInner{}
    }


    Object annoFoo(){
        return new Object(){
            public String toString(){
                return "annonymous";
            }
        };
    }

    static Object staticAnnoFoo(){
        return new Object(){
            public String toString(){
                return "annonymous";
            }
        };
    }

}
