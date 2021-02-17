package ncu.MavenSpringProgram4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fortuneService")
public class FortuneService implements IFortune {
	
	@Autowired
	private FileRead fileRead;
	@Autowired
	private RandomNumber randomNumber;
	
	@Override
	public String getFortune() throws FileNotFoundException{
		// TODO Auto-generated method stub
		ArrayList<String> list = fileRead.dataFile();
		return list.get(randomNumber.getRandomValue(0, list.size() - 1));
	}

	public FileRead getFileRead() {
		return fileRead;
	}

	public void setFileRead(FileRead fileRead) {
		this.fileRead = fileRead;
	}

}
