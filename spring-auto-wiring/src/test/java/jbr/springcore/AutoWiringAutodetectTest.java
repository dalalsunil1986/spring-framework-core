package jbr.springcore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import jbr.autowiring.autodetect.Ranjith;
import jbr.autowiring.autodetect.Sekar;

public class AutoWiringAutodetectTest {

  ApplicationContext applicationContext;
  Ranjith personAutodetectConstructor;
  Sekar personAutodetectByType;

  @Before
  public void init() throws Exception {
    applicationContext = new FileSystemXmlApplicationContext("config/autowiring-beans.xml");
    personAutodetectConstructor = (Ranjith) applicationContext.getBean("personAutodetectConstructor");
    personAutodetectByType = (Sekar) applicationContext.getBean("personAutodetectByType");
  }

  @Test
  public void test() {
    System.out.println(personAutodetectConstructor);
    System.out.println(personAutodetectByType);
    Assert.assertEquals("by constructor", personAutodetectConstructor.toString());
    Assert.assertEquals("by type", personAutodetectByType.toString());
  }

}
