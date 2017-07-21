package annos;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IgnoreInfo {
    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    Priority priority() default  Priority.MEDIUM;

    String[] tags() default "";

    String createdBy() default "abc";

    String lastModified() default "21/7/2017";

}
