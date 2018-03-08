package hurrican.spring.boot.springboot.bean;

import java.io.Serializable;

/**
 * @Author: Hurrican
 * @Description:
 * @Date 2018/3/8
 * @Modified 16:33
 */
public class WeatherResponse implements Serializable{

    private WeatherBean data;


    /**
     * 接口状态的描述，“OK”代表接口正常
     */
    private String desc;

    /**
     * 接口调用的返回状态，返回值“1000”,意味着数据是接口正常
     */
    private String status;

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "data=" + data +
                ", desc='" + desc + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public WeatherBean getData() {
        return data;
    }

    public void setData(WeatherBean data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
