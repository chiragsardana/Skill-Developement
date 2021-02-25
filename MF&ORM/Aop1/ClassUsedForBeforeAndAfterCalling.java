package ncu.Aop1;

import org.springframework.stereotype.Component;

@Component("classUsedForBeforeAndAfterCalling")
public class ClassUsedForBeforeAndAfterCalling {
	public void details() {
		System.out.println("Details method of Class!!!");
	}
}
