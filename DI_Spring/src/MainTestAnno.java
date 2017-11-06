import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.anno.consumer.MyApplicationAnn;

public class MainTestAnno {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring_conf.xml");

		MyApplicationAnn app = context.getBean(MyApplicationAnn.class);

		app.processMessaging("Hi Kuldeep, annotation example.", "pankaj@abc.com");

	}

}
