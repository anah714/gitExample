package kr.ac.dongyang.project;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MyInfoRequest extends StringRequest {
    // 서버 url 설정 (php 파일 연동)
    final static private String URL = "http://122.32.165.55/MyUpdate.php";
    private Map<String, String> map;

    public MyInfoRequest(String id, String password, String phone, String email, String emCol1, String emCol2, String emCol3, String disease, String medicine, Response.Listener<String> listener ) {
        super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("id", id);
        map.put("password", password);
        map.put("phone", phone);
        map.put("email", email);
        map.put("emCol1", emCol1);
        map.put("emCol2", emCol2);
        map.put("emCol3", emCol3);
        map.put("disease", disease);
        map.put("medicine", medicine);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
