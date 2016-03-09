package gs.dc.ash.injectlogger.excute;

import gs.dc.ash.injectlogger.configuration.AppConfig;
import gs.dc.ash.injectlogger.service.StepService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ASH on 2016-03-09.
 */
public class Main {
    public static void main(String... args) throws Exception {
        System.out.println("23123123");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StepService stepService = context.getBean(StepService.class);

        stepService.step(1);
        stepService.step(2);
        stepService.step(3);
    }
}
