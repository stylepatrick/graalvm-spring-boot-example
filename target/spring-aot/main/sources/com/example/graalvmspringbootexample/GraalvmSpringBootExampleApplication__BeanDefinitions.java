package com.example.graalvmspringbootexample;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link GraalvmSpringBootExampleApplication}.
 */
public class GraalvmSpringBootExampleApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'graalvmSpringBootExampleApplication'.
   */
  public static BeanDefinition getGraalvmSpringBootExampleApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GraalvmSpringBootExampleApplication.class);
    beanDefinition.setTargetType(GraalvmSpringBootExampleApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(GraalvmSpringBootExampleApplication.class);
    beanDefinition.setInstanceSupplier(GraalvmSpringBootExampleApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
