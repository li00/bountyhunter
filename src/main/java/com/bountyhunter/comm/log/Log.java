package com.bountyhunter.comm.log;

import java.lang.annotation.*;

/**
 * Created by Li.Z.F on 2018/10/1.
 */
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    String module() default "";
    String url() default "";
}
