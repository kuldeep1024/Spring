import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmp.service.EMPServiceImpl;

public class MainTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_conf.xml");
		
		System.out.println("-----------------initialized---------------");
		
		//EMPServiceImpl service = context.getBean("EmpSer",EMPServiceImpl.class);
		EMPServiceImpl service = context.getBean(EMPServiceImpl.class);
		System.out.println(service.getEmp("Kuldeep"));
		
		context.registerShutdownHook();
	}

}
