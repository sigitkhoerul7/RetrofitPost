package sigit.postretrofit.Rest;

/**
 * Created by sigit on 13/08/17.
 */

public class ApiUtility {
    private ApiUtility() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static ApiService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }
}
