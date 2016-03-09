package gs.dc.ash.injectlogger.common;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by ASH on 2016-03-09.
 */
@Retention(RUNTIME)
@Target(FIELD)
@Documented
public @interface Log {
}
