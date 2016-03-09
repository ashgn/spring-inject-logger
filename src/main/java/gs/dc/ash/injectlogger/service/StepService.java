package gs.dc.ash.injectlogger.service;

import gs.dc.ash.injectlogger.common.Log;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by ASH on 2016-03-09.
 */
@Component
public class StepService {
    private static @Log Logger LOG;
    public void step(int steps){
        LOG.info("execution " + steps + " steps.");
    }
}
