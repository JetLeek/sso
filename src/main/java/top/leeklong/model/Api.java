package top.leeklong.model;/**
 * Created by pc on 2017/8/14.
 */

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 接口地址表
 *
 * @author lee
 * @create 2017-08-14 10:05
 **/
public class Api {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String apiUrl;

    private String apiDesc;

    private String levelViewName;

    private String apiProject;

    private Integer apiSort;

    private Integer apiType;

    private Integer apiStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiDesc() {
        return apiDesc;
    }

    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc;
    }

    public String getLevelViewName() {
        return levelViewName;
    }

    public void setLevelViewName(String levelViewName) {
        this.levelViewName = levelViewName;
    }

    public String getApiProject() {
        return apiProject;
    }

    public void setApiProject(String apiProject) {
        this.apiProject = apiProject;
    }

    public Integer getApiSort() {
        return apiSort;
    }

    public void setApiSort(Integer apiSort) {
        this.apiSort = apiSort;
    }

    public Integer getApiType() {
        return apiType;
    }

    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    public Integer getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(Integer apiStatus) {
        this.apiStatus = apiStatus;
    }
}
