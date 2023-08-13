import org.testng.annotations.Test;
import okhttp3.*;

public class MyApiTest {
    private OkHttpClient client = new OkHttpClient();

    @Test
    public void testApiCall() throws Exception {
        String url = BaseURL.BASE_URL + Endpoints.USERS;

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            Assertions.assertStatusCode(response.code(), 200);
            // Add more assertions and test logic here
        }
    }
}
