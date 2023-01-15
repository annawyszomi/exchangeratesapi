import okhttp3.*;

import java.io.IOException;


public class RequestDefinition {

    public int sendRequest(String url, String apikey) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("apikey", apikey)
                .build();
        Response response = client.newCall(request).execute();

       return response.code();
    }
}
