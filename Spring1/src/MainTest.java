import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.test.mamager.StudentDetails;
import com.sp.test2.sender.Communication;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring_cong.xml");
		StudentDetails std=context.getBean("student",StudentDetails.class);
		System.out.println(std.getStudent());
		
		System.out.println(std.studentList());
		
		
		System.out.println("---------------------");
		
		Communication comm=context.getBean("communication",Communication.class);
		comm.communicate();
	}

}
