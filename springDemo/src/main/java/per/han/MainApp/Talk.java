package per.han.MainApp;

import com.alibaba.fastjson.JSONObject;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Talk {

    public static String result(String Info) {
        String resultUrl = "http://route.showapi.com/60-27";
        Map<String, Object> params = new HashMap<>();
        params.put("showapi_appid","95103");
        params.put("info",Info);
        params.put("showapi_sign","d5cc525bd8db45fbba184209490e2d79");
        String aStr = httpRequest(resultUrl,params);
        JSONObject jsonObject = JSONObject.parseObject(aStr).getJSONObject("showapi_res_body");
        return jsonObject.getString("text");
    }

    private static String httpRequest(String requestUrl, Map<String, Object> params) {
        StringBuilder stringBuffer = new StringBuilder();
        BufferedReader buffReader = null;
        try {
            URL url = new URL(requestUrl + "?" + urlEncode(params));
            HttpURLConnection httpUrlConnect = (HttpURLConnection) url.openConnection();
            httpUrlConnect.setDoInput(true);
            httpUrlConnect.setRequestMethod("GET");
            httpUrlConnect.connect();

            buffReader = new BufferedReader
                    (new InputStreamReader
                            (httpUrlConnect.getInputStream(), StandardCharsets.UTF_8));

            String aString;

            while ((aString = buffReader.readLine()) != null) {
                stringBuffer.append(aString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffReader != null) {
                    buffReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuffer.toString();
    }

    private static String urlEncode(Map<String, Object> data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Object> i : data.entrySet()) {
            try {
                stringBuilder.
                        append(i.getKey()).
                        append("=").
                        append(URLEncoder.encode(i.getValue() + "", "UTF-8")).
                        append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
