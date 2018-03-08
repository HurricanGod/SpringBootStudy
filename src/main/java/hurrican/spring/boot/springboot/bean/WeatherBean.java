package hurrican.spring.boot.springboot.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Hurrican
 * @Description:
 * @Date 2018/3/8
 * @Modified 16:14
 */

public class WeatherBean implements Serializable{

    /**
     * 城市
     */
    private String city;

    /**
     * 空气指数
     */
    private String aqi;

    /**
     * 实时温度
     */
    private String wendu;

    /**
     * 感冒指数
     */
    private String ganmao;

    private Yesterday yesterday;

    private List<Forecast> forecast;

    @Override
    public String toString() {
        return "WeatherBean{" +
                "city='" + city + '\'' +
                ", aqi='" + aqi + '\'' +
                ", wendu='" + wendu + '\'' +
                ", ganmao='" + ganmao + '\'' +
                ", yesterday=" + yesterday +
                ", forecast=" + forecast +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
}
