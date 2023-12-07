package sg.edu.nus.sg.d19lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D19LectureApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(D19LectureApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String pathFileName = "c:\\data\\employees.json"; // for windows users
		pathFileName = "//data";

		File file = new File(pathFileName);
		InputStream is = new FileInputStream(file);

		StringBuilder resultStringBuilder = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			
		}
	}

}
