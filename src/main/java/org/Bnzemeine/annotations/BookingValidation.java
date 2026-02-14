package org.Bnzemeine.annotations;

import java.lang.annotation.*;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BookingValidation {

    boolean emailRequired() default true;
    boolean phoneRequired() default true;
    boolean passwordRequired() default true;


}
