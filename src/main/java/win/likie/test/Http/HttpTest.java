package top.annwz.test.Http;


import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by huahui.wu on 2017/5/24.
 */
public class HttpTest {
	public static void main(String[] args) {
		String url = "www.baidu.com";
		String charset = "utf-8";
		try {
			HttpTest.testGet(url);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testGet(String url) throws ClientProtocolException, IOException {
		// TODO Auto-generated constructor stub
		DefaultHttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(url);
		org.apache.http.HttpResponse response = httpclient.execute(httpget);
		if(response!=null)
		{
			HttpEntity entity = response.getEntity();
			String strResult = EntityUtils.toString(entity,"UTF-8");
			System.out.println(strResult);
			EntityUtils.consume(entity);
		}
		httpget.abort();
	}
}
