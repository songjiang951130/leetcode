package com.github.songjiang951130.ioc.core.annotation;


import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Nonnull(when = When.MAYBE)
//@TypeQualifierNickname
public @interface Nullable {
}