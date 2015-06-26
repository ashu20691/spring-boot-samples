package intellimeet

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent
import org.springframework.boot.context.event.ApplicationStartedEvent
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class ExampleController {

    @RequestMapping("/")
    String home() {
        return "Hello World!SpringBoot runs so spring app so quickly";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(ExampleController.class)

//        app.showBanner=false





        app.addListeners(new ApplicationListener<ApplicationStartedEvent>() {
            @Override
            public void onApplicationEvent(ApplicationStartedEvent applicationEvent) {
                System.out.println("Application will load here after.....");
            }
        });
        app.addListeners(new ApplicationListener<ApplicationEnvironmentPreparedEvent>() {
            @Override
            public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEvent) {
                System.out.println("Application environment has been prepared......");
            }
        });
        app.logStartupInfo(false)

        app.run(args)
    }

}

