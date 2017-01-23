package test;

import bean.Environment;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

/**
 * Created by Lee on 2017/1/23 0023.
 */
public class Get {
    public static void main(String[] args) throws IOException {
        Get get=new Get();
        get.run1("http://localhost:8080/temps");
    }
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    void run1(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        String json=response.body().string();
        ObjectMapper mapper = new ObjectMapper();
        List<Environment> list=mapper.readValue(json,List.class);
        System.out.println(list);
    }
}
