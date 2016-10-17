package SpringBootLaunchSample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by
 * Nikolay Fiantsev on 06/11/15.
 */

@SpringBootApplication      //- this is equivalent to using @Configuration (Configuration class search Beans and etc..) - @EnableAutoConfiguration and @ComponentScan

@PropertySources({
        @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true),
        @PropertySource(value = "file:/data/MishenkaProvider/application.properties", ignoreResourceNotFound = true)
})

public class SpringBootLaunchSampleApplication {

    private static final Logger theLogger = LoggerFactory.getLogger(SpringBootLaunchSampleApplication.class);

    public static void main(String[] args) {

        try {
            SpringApplication.run(SpringBootLaunchSampleApplication.class, args);
        }
        catch (Throwable e) {
            theLogger.error("Uncaught exception - " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

}
