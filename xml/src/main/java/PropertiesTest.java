import com.google.common.collect.Maps;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("datasources.properties");
        Properties properties = PropertiesLoaderUtils.loadProperties(resource);
        Map<String, String> mapOfProperties = Maps.fromProperties(properties);
        System.out.println(mapOfProperties);
    }
}
