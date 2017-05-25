package win.likie.test;

import java.io.*;

/**
 * Created by Wuhuahui on 2016/12/29.
 */
public class IOTest {

	public void test() throws IOException {
		File file = new File("d://1.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] b = new byte[1024];
		int ch = 0;
		while ((ch = fileInputStream.read(b)) != -1) {

		}
	}

	public void test2() throws IOException{
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	                new FileOutputStream(""), "utf-8"));
	        writer.write("");


	}

	public void test3(){
		String path = "d://test.txt";

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(path), "utf-8"));
			System.out.println(reader.readLine());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test4() {
		File file = new File("d://test.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fileInputStream);
			byte[] b = new byte[1024];
			int ch = 0;
			while ((ch = fileInputStream.read(b)) != -1){
				System.out.println(fileInputStream.read(b));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test5() {
		try {
			FileInputStream fileInputStream = new FileInputStream("d://test.txt");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "utf-8"));
			String bf = null;
			while ((bf = bufferedReader.readLine()) != null)
			System.out.println(bf);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test6() {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		try {
			String s=br.readLine();
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		IOTest ioTest = new IOTest();

		ioTest.test5();
		ioTest.test3();
		ioTest.test6();

	}
 }
