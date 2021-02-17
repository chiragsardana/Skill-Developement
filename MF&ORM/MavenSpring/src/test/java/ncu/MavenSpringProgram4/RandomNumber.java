package ncu.MavenSpringProgram4;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component("randomNumber")
public class RandomNumber {
	
	public static int getRandomValue(int Min, int Max) 
    { 
  
        // Get and return the random integer 
        // within Min and Max 
        return ThreadLocalRandom.current().nextInt(Min, Max + 1); 
    }
}
