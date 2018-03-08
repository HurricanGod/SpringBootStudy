package hurrican.spring.boot.springboot.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import hurrican.spring.boot.springboot.bean.WeatherResponse;
import hurrican.spring.boot.springboot.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @Author: Hurrican
 * @Description:
 * @Date 2018/3/8
 * @Modified 16:45
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private RestTemplate template;

    private final String weatherApiUrl = "http://wthrcdn.etouch.cn/weather_mini";

    @Override
    public WeatherResponse queryWeatherByCityName(String name) {
        return getWeatherData(name);
    }


    private WeatherResponse getWeatherData(String cityName){
        String url = weatherApiUrl + "?city=" + cityName;
        ResponseEntity<String> response = template.getForEntity(url, String.class);

        String responseBody = null;
        if(response.getStatusCodeValue() == 200){
            responseBody = response.getBody();
        }

        ObjectMapper objectMapper = new ObjectMapper();

        WeatherResponse weatherResponse = null;

        try {
            weatherResponse = objectMapper.readValue(responseBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherResponse;
    }
}
