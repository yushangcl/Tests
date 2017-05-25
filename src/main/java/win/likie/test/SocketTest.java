package win.likie.test;
import sun.net.www.http.HttpClient;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Wuhuahui on 2016/12/9.
 */
public class SocketTest {

	public static void main(String[] args) throws Exception {
		//创建URL对象
		URL url=new URL("http://www.javasoft.com/cgi-bin/backwards");
		//由URL对象获取URLConnection对象
		URLConnection conn=url.openConnection();
		//由URLConnection获取输入流，并构造DataInputStream对象
		DataInputStream dis=new DataInputStream(conn.getInputStream());
		//由URLConnection获取输出流，并构造PrintStream对象
		PrintStream ps=new PrintStream(conn.getOutputStream());
		String line=dis.readLine();
		ps.println("client…"); //向服务器写出字符串 "client…"

	}
}