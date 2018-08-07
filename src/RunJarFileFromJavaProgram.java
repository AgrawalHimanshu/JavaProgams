import java.io.IOException;

public class RunJarFileFromJavaProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		ProcessBuilder builder = new ProcessBuilder("java -jar C:\\Users\\himanshuagrawal\\Downloads\\jenkins.war");		    
		Process process = builder.start();

		System.exit(0);
	}

}
