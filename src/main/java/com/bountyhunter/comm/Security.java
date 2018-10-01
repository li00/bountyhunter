package com.bountyhunter.comm;

import org.springframework.stereotype.Component;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * 验证码
 * Created by Li.Z.F on 2018/10/1.
 */
@Component
public class Security {

    private String[] exp = {"+", "-", "x", "加", "减", "乘"};

    //加密
    public String createCertificate(String key) {
        key=key.replace("0","Z").replace("1","O").replace("2","T").replace("8","E");
        byte[] bytes = key.getBytes();
        return (new BASE64Encoder()).encodeBuffer(bytes);
    }

    //解密
    public String parseCertificate(String key) {
        String result = null;
        try {
            byte[] bytes = (new BASE64Decoder()).decodeBuffer(key);
            result = new String(bytes, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.replace("Z","0").replace("O","1").replace("T","2").replace("E","8");
    }

    public String[] getCode() {
        int rand = (int) (Math.random() * exp.length);
        String[] result = new String[2];
        int rand1 = getRand();
        int rand2 = getRand();
        switch (exp[rand]) {
            case "+":
                result[0]= rand1+rand2+"";
                result[1]= rand1+"+"+rand2+"=";
                break;
            case "-":
                result[0]= rand1-rand2+"";
                result[1]= rand1+"-"+rand2+"=";
                break;
            case "x":
                result[0]= rand1*rand2+"";
                result[1]= rand1+"x"+rand2+"=";
                break;
            case "加":
                result[0]= rand1+rand2+"";
                result[1]= rand1+"加"+rand2+"等于";
                break;
            case "减":
                result[0]= rand1-rand2+"";
                result[1]= rand1+"减"+rand2+"等于";
                break;
            case "乘":
                result[0]= rand1*rand2+"";
                result[1]= rand1+"乘"+rand2+"等于";
                break;
        }
        return null;
    }

    private int getRand(){
        return (int)(Math.random()*10);
    }

    public static void main(String[] args) {
        Security security = new Security();
        String k = security.createCertificate("bountyhunter");
        System.out.println(k);
        System.out.println(security.parseCertificate(k));

    }
}
