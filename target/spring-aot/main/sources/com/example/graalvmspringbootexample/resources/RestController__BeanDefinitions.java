package com.example.graalvmspringbootexample.resources;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestController}.
 */
public class RestController__BeanDefinitions {
  /**
   * Get the bean definition for 'restController'.
   */
  public static BeanDefinition getRestControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestController.class);
    beanDefinition.setInstanceSupplier(RestController::new);
    return beanDefinition;
  }
}
