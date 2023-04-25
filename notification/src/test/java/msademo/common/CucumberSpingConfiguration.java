package msademo.common;

import io.cucumber.spring.CucumberContextConfiguration;
import msademo.NotificationApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificationApplication.class })
public class CucumberSpingConfiguration {}
