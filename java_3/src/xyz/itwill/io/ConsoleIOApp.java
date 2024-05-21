package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;

public class ConsoleIOApp {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		out.write("이름 입력 >> ");
		out.flush();

		System.out.println("이름 입력");

		String name = in.readLine();

		System.out.println("태어난 년도 입력 >>");
		int birtYear = Integer.parseInt(in.readLine());
		
		int age = Calendar.getInstance().get(Calendar.YEAR)-birtYear;
		
		System.out.println(name + age);

	}
}
