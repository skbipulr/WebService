package com.example.bipul.webservice;

import com.example.bipul.webservice.Remote.IpService;

public class Common {

    private static final String BASE_URL="http://ip.jsontest.com/";

    public static IpService getIpService()
    {
        return RetrofitClient.getRetrofit(BASE_URL).create(IpService.class);
    }
}
