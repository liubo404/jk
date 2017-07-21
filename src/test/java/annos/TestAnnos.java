package annos;


import org.junit.Test;

@IgnoreInfo(
        priority = IgnoreInfo.Priority.HIGH,
        createdBy = "test",
        tags = {"sales","test"}
)
public class TestAnnos {

    @Test
    public void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @Ignore(enabled = false)
    public void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }
}
