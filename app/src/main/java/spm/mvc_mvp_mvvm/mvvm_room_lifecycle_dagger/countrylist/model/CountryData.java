package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model;

import java.util.List;

/**
 * Created by root on 4/26/18.
 */

public class CountryData
{
    private List<CountryResult> result;

    private String[] messages;

    public List<CountryResult> getResult ()
    {
        return result;
    }

    public void setResult (List<CountryResult> result)
    {
        this.result = result;
    }

    public String[] getMessages ()
    {
        return messages;
    }

    public void setMessages (String[] messages)
    {
        this.messages = messages;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [result = "+result+", messages = "+messages+"]";
    }
}
