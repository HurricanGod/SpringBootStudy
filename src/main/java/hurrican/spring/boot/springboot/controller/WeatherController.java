package hurrican.spring.boot.springboot.controller;

import hurrican.spring.boot.springboot.bean.WeatherResponse;
import hurrican.spring.boot.springboot.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Hurrican
 * @Description:
 * @Date 2018/3/8
 * @Modified 16:12
 */
@RestController
@RequestMapping(value = "/home")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @RequestMapping(value = "/getWeather")
    public Map<String, Object> queryWeatherByCityName(String cityName){
        HashMap<String, Object> model = new HashMap<>();
        WeatherResponse weatherResponse = weatherDataService.queryWeatherByCityName(cityName);
        model.put("weather", weatherResponse);
        return model;
    }
}
