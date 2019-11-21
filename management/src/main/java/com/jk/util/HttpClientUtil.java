package com.jk.util;
 
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import org.apache.http.HttpResponse;  

/**
 * 
 * 类: HttpClient <br>
 * 描述: httpclient工具类 <br>
 * 作者: song<br>
 * 时间: 2017年7月21日 下午3:15:27
 */
public class HttpClientUtil {
	//static 代表第一次调用的时候创建，不会再重复创建
	static CloseableHttpClient client = null;
	static {
		//1、创建httpClient实例
		client = HttpClients.createDefault();
	}
	
	/**
	 * 
	 * 方法: get <br>
	 * 描述: get请求 <br>
	 * 作者: Teacher song<br>
	 * 时间: 2017年7月21日 下午3:15:25
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String get(String url,HashMap<String, Object> params){
		try {
			//2、创建连接方式（get）实例
			HttpGet httpGet = new HttpGet();
			
			//3、拼接（get）请求路径
			Set<String> keySet = params.keySet();
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(url).append("?t=").append(System.currentTimeMillis());
			for (String key : keySet) {
				stringBuffer.append("&").append(key).append("=").append(params.get(key));
			}
			
			httpGet.setURI(new URI(stringBuffer.toString()));
			//4、执行execute方法，发送请求
			CloseableHttpResponse execute = client.execute(httpGet);
				//获取返回的对象
			HttpEntity httpEntity = execute.getEntity();
			//5、获取请求的状态码  --200:登录成功
			int statusCode = execute.getStatusLine().getStatusCode();
			//判断请求是否成功
//				如果不成功--返回 “”值
			if (200 != statusCode) {
				return "";
			}
//				如果成功--返回服务端传递回来的字符串
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 
	 * 方法: post <br>
	 * 描述: post请求 <br>
	 * 作者: Teacher song<br>
	 * 时间: 2017年7月21日 下午3:20:31
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String post(String url,HashMap<String, Object> params) {
		try {
			HttpPost httpPost = new HttpPost();
			httpPost.setURI(new URI(url));
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			Set<String> keySet = params.keySet();
			for (String key : keySet) {
				NameValuePair e = new BasicNameValuePair(key, params.get(key).toString());
				parameters.add(e);
			}
			
			HttpEntity entity = new UrlEncodedFormEntity(parameters , "utf-8");
			httpPost.setEntity(entity);
			
			CloseableHttpResponse execute = client.execute(httpPost);
			
			//获取返回的对象
			HttpEntity httpEntity = execute.getEntity();
			
			int statusCode = execute.getStatusLine().getStatusCode();
			if (200 != statusCode) {
				return "";
			}
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			e.printStackTrace();
			return null;
		}
	}
	
	//传字符串
	public static String post2(String url,String params) {
		try {
			HttpPost httpPost = new HttpPost();
			httpPost.setURI(new URI(url));
			httpPost.setHeader("Content-Type", "application/json");
			
			StringEntity stringEntity = new StringEntity(params,"utf-8");
			httpPost.setEntity(stringEntity);
			
			CloseableHttpResponse execute = client.execute(httpPost);
			
			int statusCode = execute.getStatusLine().getStatusCode();
			if (200 != statusCode) {
				return "";
			}
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			e.printStackTrace();
			return null;
		}
	}
	
	//处理短信调用：header需要传参
	public static String post3(String url,HashMap<String, Object> params,HashMap<String, Object> heanderParams) {
		try {
			HttpPost httpPost = new HttpPost();
			httpPost.setURI(new URI(url));
			
			Set<String> headerkey = heanderParams.keySet();
			for (String key : headerkey) {
				httpPost.addHeader(key,heanderParams.get(key).toString());
			}
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			Set<String> keySet = params.keySet();
			for (String key : keySet) {
				NameValuePair e = new BasicNameValuePair(key, params.get(key).toString());
				parameters.add(e);
			}
			
			HttpEntity entity = new UrlEncodedFormEntity(parameters , "utf-8");
			httpPost.setEntity(entity);
			
			CloseableHttpResponse execute = client.execute(httpPost);
			
			int statusCode = execute.getStatusLine().getStatusCode();
			if (200 != statusCode) {
				return "";
			}
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			e.printStackTrace();
			return null;
		}
	}
	/*//删除
	public static String DELETE(String url,Map<String,String> dataForm){
        HttpClient httpClient = new HttpClient();
        DeleteMethod deleteMethod = new DeleteMethod(url);
 
        List<org.apache.commons.httpclient.NameValuePair> data = new ArrayList<org.apache.commons.httpclient.NameValuePair>();
        if(dataForm!=null){
            Set<String> keys = dataForm.keySet();
            for(String key:keys){
            	org.apache.commons.httpclient.NameValuePair nameValuePair = new org.apache.commons.httpclient.NameValuePair(key, (String) dataForm.get(key));
                data.add(nameValuePair);
            }
        }
        deleteMethod.setQueryString(data.toArray(new org.apache.commons.httpclient.NameValuePair[0]));
        try {
            int statusCode = httpClient.executeMethod(deleteMethod);
            if (statusCode != HttpStatus.SC_OK) {
                return "Method failed: " + deleteMethod.getStatusLine();
            }
 
            // Read the response body.
            byte[] responseBody = deleteMethod.getResponseBody();
            // Deal with the response.
            // Use caution: ensure correct character encoding and is not binary data
            return new String(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            deleteMethod.releaseConnection();
        }
        return null;
    }*/

	/** <pre>doPost(这里用一句话描述这个方法的作用)   
	 * 创建人：王泽
	 * 创建时间：2019年10月17日 下午3:59:29    
	 * 修改人：王泽
	 * 修改时间：2019年10月17日 下午3:59:29
	 * @param httpOrgCreateTest
	 * @param createMap
	 * @param charset
	 * @return</pre>    
	 */
	  public String doPost(String url,Map<String,String> map,String charset){  
	        HttpClient httpClient = null;  
	        HttpPost httpPost = null;  
	        String result = null;  
	        try{  
	            httpClient = new SSLClient();  
	            httpPost = new HttpPost(url);  
	            //设置参数  
	            
	            List<NameValuePair> list = new ArrayList<NameValuePair>();  
	            Iterator iterator = map.entrySet().iterator();  
	            while(iterator.hasNext()){  
	                Entry<String,String> elem = (Entry<String, String>) iterator.next();  
	                list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));  
	            }  
	            Long timers = new Date().getTime();
	            String appKey = "cb636214a5f60adbf38f6c3dd52836af";//标识
	            String appSecret = "4f6762514985";//密钥
	            String nonce = "123456";	//随机数（最大长度128个字符）
	            String curTime = timers.toString();	//当前UTC时间戳，从1970年1月1日0点0 分0 秒开始到现在的秒数(String)
//	            CheckSum	SHA1(AppSecret + Nonce + CurTime),三个参数拼接的字符串，进行SHA1哈希计算，转化成16进制字符(String，小写)
	           
	            
	            String checkSumStr = CheckSumBuilder.getCheckSum(appSecret, nonce, curTime);
	            httpPost.setHeader("AppKey", appKey);
	            httpPost.setHeader("Nonce", nonce);
	            httpPost.setHeader("CurTime", timers.toString());
	            httpPost.setHeader("CheckSum", checkSumStr);
	            if(list.size() > 0){  
	                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);  
	                httpPost.setEntity(entity);  
	            }  
	            HttpResponse response = httpClient.execute(httpPost);  
	            if(response != null){  
	                HttpEntity resEntity = response.getEntity();  
	                if(resEntity != null){  
	                    result = EntityUtils.toString(resEntity,charset);  
	                }  
	            }  
	        }catch(Exception ex){  
	            ex.printStackTrace();  
	        }  
	        return result;  
	    }  

	
	
	/*//调用短息接口
	public static void main(String[] args) {
		String url = "https://api.netease.im/sms/sendcode.action";
		//header参数
		HashMap<String, Object> header = new HashMap<String, Object>();
		header.put("AppKey",RedisCommonConf.APP_KEY);//开发者平台分配的appkey
		String nonce = UUID.randomUUID().toString();
		header.put("Nonce", nonce);//随机数（最大长度128个字符）
		String curTime = String.valueOf(System.currentTimeMillis()/1000);
		header.put("CurTime", curTime);//当前UTC时间戳，从1970年1月1日0点0 分0 秒开始到现在的秒数(String)
		//SHA1(AppSecret + Nonce + CurTime)，三个参数拼接的字符串，进行SHA1哈希计算，转化成16进制字符(String，小写)
		String appSecret = RedisCommonConf.APP_SECRET;
		String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce, curTime);
		header.put("CheckSum",checkSum);
		
		//body的参数
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("mobile", "18630062106");//手机号
		params.put("templateid", 14831069);//模板编号(如不指定则使用配置的默认模版)
		//验证码 999999 100000
		long code = Math.round((Math.random()*899999+100000));
		params.put("authCode", code);//客户自定义验证码，长度为4～10个数字
		
		String str = post3(url, params,header);
		System.out.println(str);
	}
	
	public static void main2(String[] args) {
		String url = "http://t.weather.sojson.com/api/weather/city/101030100";
		HashMap<String, Object> params = new HashMap<String, Object>();
		String returnStr = get(url, params);
		//System.out.println(returnStr);
		JSONObject parseObject = JSON.parseObject(returnStr);
		JSONObject jsonObject = parseObject.getJSONObject("data");
		JSONObject jsonObject2 = jsonObject.getJSONObject("yesterday");
		String string = jsonObject2.getString("high");
		
		JSONArray jsonArray = jsonObject.getJSONArray("forecast");
		JSONObject jsonObject3 = jsonArray.getJSONObject(0);
		String string2 = jsonObject3.getString("week");
		System.out.println(string2);
		
		System.out.println(string);
		
	}*/
}
