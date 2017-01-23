package test;

import bean.Temp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

/**
 * Created by Lee on 2017/1/23 0023.
 */
public class Post {
    public static void main(String[] args) throws IOException {
        Post post=new Post();
        String json=post.getTemp();
        post.post("http://localhost:8080/temps",json);
    }
    private String getTemp() throws JsonProcessingException {
        Temp temp=new Temp();
        temp.setWendu("1");
        temp.setShidu("2");
        temp.setNongdu("3");
        temp.setMinghuo("0");
        temp.setWairen("1");
        ObjectMapper mapper = new ObjectMapper();
        String json=mapper.writeValueAsString(temp);
        return json;
    }



    MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();
    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
