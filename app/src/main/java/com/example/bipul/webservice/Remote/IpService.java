package com.example.bipul.webservice.Remote;

import com.example.bipul.webservice.Model.Ip;

import retrofit2.Call;
import retrofit2.http.GET;


public interface IpService {

    @GET("/")
    Call<Ip> getIp();
}

