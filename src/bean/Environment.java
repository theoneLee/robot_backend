package bean;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 从机器人取到的一组数据（已转化）
 * Created by Lee on 2017/1/23 0023.
 */
@Component
public class Environment {
    private Integer id;
    private String wendu;
    private String shidu;
    private String nongdu;
    private String wairen;
    private String minghuo;
    private Date date;

    public String getMinghuo() {
        return minghuo;
    }

    public void setMinghuo(String minghuo) {
        this.minghuo = minghuo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getWairen() {
        return wairen;
    }

    public void setWairen(String wairen) {
        this.wairen = wairen;
    }

    public String getNongdu() {
        return nongdu;
    }

    public void setNongdu(String nongdu) {
        this.nongdu = nongdu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
