package spm.mvc_mvp_mvvm.network;

public interface RetrofitResponseListener {
    public void onResponse(Object object, int apiTag);
    public void onError(String error);
}
