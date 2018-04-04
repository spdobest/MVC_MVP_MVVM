package spm.mvc_mvp_mvvm.ui.mvvm.model;

public class UserData
{
    private String work;

    private String lname;

    private String userPic;

    private String FirebaseToken;

    private String status;

    private String about;


    private String education;

    private String city;

    private String mobilenumber;

    private String age;

    private String profilePic;

    private String gender;

    private String fname;

    public String getWork ()
    {
        return work;
    }

    public void setWork (String work)
    {
        this.work = work;
    }

    public String getLname ()
    {
        return lname;
    }

    public void setLname (String lname)
    {
        this.lname = lname;
    }

    public String getUserPic ()
    {
        return userPic;
    }

    public void setUserPic (String userPic)
    {
        this.userPic = userPic;
    }

    public String getFirebaseToken ()
    {
        return FirebaseToken;
    }

    public void setFirebaseToken (String FirebaseToken)
    {
        this.FirebaseToken = FirebaseToken;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getAbout ()
    {
        return about;
    }

    public void setAbout (String about)
    {
        this.about = about;
    }


    public String getEducation ()
    {
        return education;
    }

    public void setEducation (String education)
    {
        this.education = education;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getMobilenumber ()
    {
        return mobilenumber;
    }

    public void setMobilenumber (String mobilenumber)
    {
        this.mobilenumber = mobilenumber;
    }

    public String getAge ()
    {
        return age;
    }

    public void setAge (String age)
    {
        this.age = age;
    }

    public String getProfilePic ()
    {
        return profilePic;
    }

    public void setProfilePic (String profilePic)
    {
        this.profilePic = profilePic;
    }

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getFname ()
    {
        return fname;
    }

    public void setFname (String fname)
    {
        this.fname = fname;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [work = "+work+", lname = "+lname+", userPic = "+userPic+", FirebaseToken = "+FirebaseToken+", status = "+status+", about = "+about+",  education = "+education+", city = "+city+", mobilenumber = "+mobilenumber+", age = "+age+", profilePic = "+profilePic+", gender = "+gender+", fname = "+fname+" ]";
    }
}