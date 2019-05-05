package tw.com.fw.dano.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import tw.com.fw.temple.model.ICrystal;

public class TestMain {
  public static void main(String[] args) {
    
    // load spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/tw/com/fw/resouce/xml/test.xml");
    
    // retrieve Object
    ICrystal man = context.getBean("dano",ICrystal.class);
    
    // call some method
    System.out.println(man);
    
    context.close();
  }
}
