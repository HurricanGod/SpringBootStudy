package hurrican.spring.boot.springboot.service;

import hurrican.spring.boot.springboot.bean.WeatherResponse;

/**
 * @Author: Hurrican
 * @Description:
 * @Date 2018/3/8
 * @Modified 16:43
 */
public interface WeatherDataService {

    WeatherResponse queryWeatherByCityName(String name);
}
