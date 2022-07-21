import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("springconfig.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);

//		BeanFactory is lazy intializer and is deprecated now
//		
//		ApplicationContext is eager initalizer
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("springconfig.xml");//eager initializer
		
		Employee emp = factory.getBean("emp", Employee.class);
//		Employee emp1 = factory.getBean("emp", Employee.class);
		
//		here emp and emp1 refer to the same object
		
		System.out.println(emp.hashCode());
		System.out.println(emp);
//		System.out.println(emp1.hashCode());
		
		
//		-------- Using Autowire --------
		
		ApplicationContext factory2 = new ClassPathXmlApplicationContext("springconfigWithAutowire.xml");
		Employee e = factory2.getBean("emp", Employee.class);
		System.out.println(e);
		
	}
}
