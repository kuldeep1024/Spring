import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.xml.consumer.MyApplication;

public class MainTestXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_conf.xml");
		MyApplication app=context.getBean("MyXMLApp",MyApplication.class);
		app.processMessaging("Hi Kuldeep, xml example", "645645");

	}

}
