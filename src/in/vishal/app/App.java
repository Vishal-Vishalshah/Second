package in.vishal.app;

import java.io.IOException;

import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;

public class App {

	private static Logger logger = Logger.getLogger(App.class);
	static{
	HTMLLayout layout = new HTMLLayout();
	RollingFileAppender appender = null;
	try {
		appender = new RollingFileAppender(layout,"log.html",false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	logger.addAppender(appender);
	}
	
	
	public static int div(int a, int b) {
		logger.debug("div method start");
		int ans = a/b;
		logger.debug("sum="+ans);
		return ans;
	}
	
	public static void main(String[] args) {
		
		logger.debug("main start");
		
		div(6,3);
		System.out.println("done logger");
		
	}
}
