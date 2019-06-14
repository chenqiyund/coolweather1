package activity.example.com.coolweather.gson;

/**
 * Created by Administrator on 2019/6/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
