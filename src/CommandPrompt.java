import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import org.omg.CORBA.portable.InputStream;

public class CommandPrompt {
	public static void main(String[] args){
	/*try {
        String ss = null;
        Runtime obj = null;
        
        //Process p = Runtime.getRuntime().exec("/C:/Program Files/MySQL/MySQL Server 5.5/bin/mysql --user=root --host=localhost --port=3306 --password=urihurih --database=hiru select * from emp;");
        //Process p = Runtime.getRuntime().exec("cmd.exe /c start ");
        Process p = Runtime.getRuntime().exec("cmd.exe /c start");

        //obj.exec("cmd.exe /dir");
        BufferedWriter writeer = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
        writeer.write("dir");
        writeer.flush();
        //p = Runtime.getRuntime().exec(" urihurih");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        //obj.exec(ss);
        System.out.println("Here is the standard output of the command:\n");
        while ((ss = stdInput.readLine()) != null) {
            System.out.println(ss);
        }
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((ss = stdError.readLine()) != null) {
            System.out.println(ss);
        }

    } catch (IOException e) {
        System.out.println("FROM CATCH" + e.toString());
    }*/
		/*try {
		Runtime.getRuntime().exec("cmd.exe /c start");
		Runtime.getRuntime().exec("ping localhost");
		System.out.println("ok");
		
			
		Runtime rt = Runtime.getRuntime();
		String[] testArgs = {"touch", "TEST"};
		rt.exec(testArgs);
		Process proc = rt.exec("ping localhost");
		}
		catch (IOException e) {
	        System.out.println("FROM CATCH" + e.toString());
	    }*/
		
		String[] command = {"cmd", "/C", "dir"};
        ProcessBuilder probuilder = new ProcessBuilder( command );
        //You can set up your work directory
        probuilder.directory(new File("C:\\my-app"));

        Process process;
		try {
			process = probuilder.start();
	

        //Read out dir output
        InputStream is = (InputStream) process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.printf("Output of running %s is:\n",
                Arrays.toString(command));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //Wait to get exit value
        try {
            int exitValue = process.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		}
		catch (IOException e) {
	        System.out.println("FROM CATCH" + e.toString());
	    }
	}
}
