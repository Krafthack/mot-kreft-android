package no.bekk.krafthackdroid.http;

import java.util.List;

import no.bekk.krafthackdroid.domain.Mood;
import no.bekk.krafthackdroid.dto.MoodsDto;
import retrofit.Callback;
import retrofit.http.GET;

public interface KrafthackWebService {
    @GET("/moods")
    public void getMoods(Callback<MoodsDto> callback);
}
