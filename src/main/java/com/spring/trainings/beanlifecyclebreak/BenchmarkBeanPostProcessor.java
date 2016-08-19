package com.spring.trainings.beanlifecyclebreak;

import com.spring.trainings.proxy.ProxyForBenchMark;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BenchmarkBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
        return new ProxyForBenchMark().createProxy(o);
    }

    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        return o;
    }
}
