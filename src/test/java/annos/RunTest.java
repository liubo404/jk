package annos;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * User: liubo
 * Datetime: 2017/7/2117:08
 */
public class RunTest {
    public static void main(String[] args) throws Exception {

        System.out.println("Testing...");

        int passed = 0, failed = 0, count = 0, ignore = 0;

        Class<TestAnnos> obj = TestAnnos.class;

        // Process @TesterInfo
        if (obj.isAnnotationPresent(IgnoreInfo.class)) {

            Annotation annotation = obj.getAnnotation(IgnoreInfo.class);
            IgnoreInfo testerInfo = (IgnoreInfo) annotation;

            System.out.printf("%nPriority :%s", testerInfo.priority());
            System.out.printf("%nCreatedBy :%s", testerInfo.createdBy());
            System.out.printf("%nTags :");

            int tagLength = testerInfo.tags().length;
            for (String tag : testerInfo.tags()) {
                if (tagLength > 1) {
                    System.out.print(tag + ", ");
                } else {
                    System.out.print(tag);
                }
                tagLength--;
            }

            System.out.printf("%nLastModified :%s%n%n", testerInfo.lastModified());

        }

        // Process @Test
        for (Method method : obj.getDeclaredMethods()) {

            // if method is annotated with @Test
            if (method.isAnnotationPresent(Ignore.class)) {

                Annotation annotation = method.getAnnotation(Ignore.class);
                Ignore test = (Ignore) annotation;

                // if enabled = true (default)
                if (test.enabled()) {

                    try {
                        method.invoke(obj.newInstance());
                        System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
                        failed++;
                    }

                } else {
                    System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                    ignore++;
                }

            }

        }
        System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);

    }
}
