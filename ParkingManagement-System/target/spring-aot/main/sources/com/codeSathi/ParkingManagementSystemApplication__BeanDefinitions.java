package com.codeSathi;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ParkingManagementSystemApplication}.
 */
@Generated
public class ParkingManagementSystemApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'parkingManagementSystemApplication'.
   */
  public static BeanDefinition getParkingManagementSystemApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ParkingManagementSystemApplication.class);
    beanDefinition.setInstanceSupplier(ParkingManagementSystemApplication::new);
    return beanDefinition;
  }
}
