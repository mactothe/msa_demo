package msademo.common;

import io.cucumber.spring.CucumberContextConfiguration;
import msademo.OrderApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
