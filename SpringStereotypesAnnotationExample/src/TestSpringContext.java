import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.controller.EmployeeController;
import com.test.manager.EmployeeManager;

public class TestSpringContext 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
      /*  EmployeeManager manager = (EmployeeManager) context.getBean(EmployeeManager.class);

        try {
			System.out.println(manager.createNewEmployee());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
        //OR this will also work
         
        EmployeeController controller = (EmployeeController) context.getBean(EmployeeController.class);
         
        try {
			System.out.println(controller.createNewEmployee());
			controller.checkTrans();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
