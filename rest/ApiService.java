package org.sandec.wisatasemarang.rest;

import org.sandec.wisatasemarang.model.ListWisataModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by idn on 8/12/2017.
 */

public interface ApiService {
    @GET("read_wisata.php")
//    Call<ArrayList<WisataModel>> ambilDataWisata();
    Call<ListWisataModel> ambilDataWisata();
}
