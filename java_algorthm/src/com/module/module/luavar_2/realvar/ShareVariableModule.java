package com.module.module.luavar_2.realvar;

import java.util.Properties;
import java.util.logging.Logger;

public class ShareVariableModule {//implements IModuleFactory

    public Object getInstance() {
        return new ShareVariableService();
    }

    public void init(String config) {

        try {
            // 파일 읽어오기
            System.out.println("파일 읽기");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
