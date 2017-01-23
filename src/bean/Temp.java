package bean;

import org.springframework.stereotype.Component;

/**
 * 从机器人取到的一组数据（未转化）
 * Created by Lee on 2017/1/23 0023.
 */
@Component
public class Temp {
    private String wendu;
    private String shidu;
    private String nongdu;
    private String wairen;
    private String minghuo;

    public Temp() {
    }

    public Temp(String wendu, String shidu, String nongdu, String wairen, String minghuo) {
        this.wendu = wendu;
        this.shidu = shidu;
        this.nongdu = nongdu;
        this.wairen = wairen;
        this.minghuo = minghuo;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getShidu() {
        return shidu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public String getNongdu() {
        return nongdu;
    }

    public void setNongdu(String nongdu) {
        this.nongdu = nongdu;
    }

    public String getWairen() {
        return wairen;
    }

    public void setWairen(String wairen) {
        this.wairen = wairen;
    }

    public String getMinghuo() {
        return minghuo;
    }

    public void setMinghuo(String minghuo) {
        this.minghuo = minghuo;
    }
}
