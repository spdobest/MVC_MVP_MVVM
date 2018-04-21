package spm.mvc_mvp_mvvm.architecturComponent;

public interface MyLOcationListener{
    void onDetectLocation(String location);
    void onLocationFail(String error);
}