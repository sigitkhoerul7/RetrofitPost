package sigit.postretrofit.Rest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import sigit.postretrofit.Model.Post;

/**
 * Created by sigit on 13/08/17.
 */

public interface ApiService {
    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);
}
