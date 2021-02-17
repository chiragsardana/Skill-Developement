package ncu.MavenSpringProgram4;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune{
	@Override
	public String getFortune() {
		return "U Have a Good Fortune";
	}
}
