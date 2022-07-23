package ru.screamm.aspect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Raspopov Anton
 */

@Aspect
@Component
public class LoggerAspect {
    private Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("@annotation(ru.screamm.aspect.annotation.AspectLogger)")
    public void pointCut(){

    }

    @After("pointCut()")
    public void afterMethodExecution(JoinPoint joinPoint) {
        logger.debug(joinPoint.getThis().toString());
        logger.debug("After method execution");
    }

}
