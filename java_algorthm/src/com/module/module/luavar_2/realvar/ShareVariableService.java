package com.module.module.luavar_2.realvar;

import java.util.HashMap;
import java.util.Map;

public class ShareVariableService {

    /*
    * Docker 에 모듈 jar 파일을 올려 시나리오에서 가져오는 방법.
    * */
    private Map<String, Object> varMap = new HashMap<>();

    public String setVariable(String key, String value) {

        try {
            varMap.put(key, value);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    public Object getVariable(String key) {

        try {
            return varMap.get(key);
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
