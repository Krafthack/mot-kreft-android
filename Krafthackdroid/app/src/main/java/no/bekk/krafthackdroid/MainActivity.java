package no.bekk.krafthackdroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import no.bekk.krafthackdroid.domain.Mood;
import no.bekk.krafthackdroid.dto.MoodsDto;
import no.bekk.krafthackdroid.http.KrafthackWebService;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Config.URL)
                .build();

        KrafthackWebService service = restAdapter.create(KrafthackWebService.class);
        service.getMoods(new Callback<MoodsDto>() {
            @Override
            public void success(MoodsDto mood, Response response) {
                Log.i("getMoods", "Success");
            }

            @Override
            public void failure(RetrofitError error) {
                Log.i("getMoods", "Failed");
            }
        });

    }
}
