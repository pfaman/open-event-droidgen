package org.fossasia.openevent.core.feed.facebook.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FacebookGraphAPI {

    @GET("/{event_name}")
    Observable<FacebookPageId> getPageId(@Path("event_name") String eventName, @Query("access_token") String accessToken);

    @GET("/{page_id}/feed")
    Observable<Feed> getPosts(@Path("page_id") String pageId, @Query("fields") String fields, @Query("access_token") String accessToken);

}
