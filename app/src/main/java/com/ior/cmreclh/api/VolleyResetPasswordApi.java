package com.ior.cmreclh.api;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abhishek Jha on 06.02.2018.
 */

public class VolleyResetPasswordApi extends StringRequest {

    private static final String RESET_PASSWORD_URL = "http://step2success.co.in/cmrec_abhishek/api/sendEmailPassword.php";
    private Map<String, String> parameters;
    public VolleyResetPasswordApi(String RollNo, String Date, Response.Listener<String> listener) {
        super(Request.Method.POST, RESET_PASSWORD_URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("Date", Date);
        parameters.put("RollNo", RollNo);
    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}
