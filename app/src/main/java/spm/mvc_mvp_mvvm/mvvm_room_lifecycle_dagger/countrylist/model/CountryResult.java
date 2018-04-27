package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model;

/**
 * Created by root on 4/26/18.
 */

public class CountryResult {
    public CountryResult() {
    }

    public CountryResult(String name, String alpha2_code, String alpha3_code) {
        this.name = name;
        this.alpha2_code = alpha2_code;
        this.alpha3_code = alpha3_code;
    }

    private String name;

    private String alpha2_code;

    private String alpha3_code;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAlpha2_code ()
    {
        return alpha2_code;
    }

    public void setAlpha2_code (String alpha2_code)
    {
        this.alpha2_code = alpha2_code;
    }

    public String getAlpha3_code ()
    {
        return alpha3_code;
    }

    public void setAlpha3_code (String alpha3_code)
    {
        this.alpha3_code = alpha3_code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", alpha2_code = "+alpha2_code+", alpha3_code = "+alpha3_code+"]";
    }
}
