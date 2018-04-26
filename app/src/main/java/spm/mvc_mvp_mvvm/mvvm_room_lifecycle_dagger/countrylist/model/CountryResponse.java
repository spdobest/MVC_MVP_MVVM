package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model;

/**
 * Created by root on 4/26/18.
 */

public class CountryResponse {
    private CountryData RestResponse;

    public CountryData getRestResponse ()
    {
        return RestResponse;
    }

    public void setRestResponse (CountryData RestResponse)
    {
        this.RestResponse = RestResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RestResponse = "+RestResponse+"]";
    }
}
