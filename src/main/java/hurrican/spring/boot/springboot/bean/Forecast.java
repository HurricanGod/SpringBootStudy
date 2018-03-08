package hurrican.spring.boot.springboot.bean;

import java.io.Serializable;

/**
 * @Author: Hurrican
 * @Description:
 * @Date 2018/3/8
 * @Modified 16:15
 */
public class Forecast implements Serializable{

    private String date;

    private String high;

    private String fengxiang;

    private String low;

    private String fengli;

    private String type;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFengxiang() {
        return fengxiang;
    }

    public void setFengxiang(String fengxiang) {
        this.fengxiang = fengxiang;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFengli() {
        return fengli;
    }

    public void setFengli(String fengli) {
        this.fengli = fengli;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "date='" + date + '\'' +
                ", high='" + high + '\'' +
                ", fengxiang='" + fengxiang + '\'' +
                ", low='" + low + '\'' +
                ", fengli='" + fengli + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
