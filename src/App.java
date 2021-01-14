import java.awt.EventQueue;

import controller.LoginController;
import view.LoginView;

public class App {

	// day la ham main
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				LoginView view = new LoginView();
				LoginController controller = new LoginController(view);
				//hien thi man hinh login
				controller.showLoginView();
				controller.showMessage();
			}
		});
	}
}

