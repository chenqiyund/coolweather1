package activity.example.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2019/6/11.
 */

public class Province extends DataSupport {
    private int id;
    private String proviinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviinceName() {
        return proviinceName;
    }

    public void setProviinceName(String proviinceName) {
        this.proviinceName = proviinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
