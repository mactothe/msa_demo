package msademo.common;

import io.cucumber.spring.CucumberContextConfiguration;
import msademo.DashboardApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashboardApplication.class })
public class CucumberSpingConfiguration {}
