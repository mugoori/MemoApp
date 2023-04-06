package com.mugoori.memoapp.api;

import com.mugoori.memoapp.model.Memo;
import com.mugoori.memoapp.model.MemoList;
import com.mugoori.memoapp.model.Res;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MemoApi {

    // 내 메모 가져오는 APi
    @GET("/memo")
    Call<MemoList> getMemoList(@Header("Authorization") String token, @Query("offset") int offset, @Query("limit") int limit);

    @POST("/memo")
    Call<Res>  addMemo(@Header("Authorization") String token, @Body Memo memo);

    // 메모 수정 API
    @PUT("/memo/{memoId}")
    Call<Res> updateMemo(@Path("memoId") int memoId, @Header("Authorization") String token, @Body Memo memo);

    // 메모 삭제 API
    @PUT("/memo/{memoId}")
    Call<Res> deleteMemo(@Path("memoId") int memoId, @Header("Authorization") String token);
}
