package co.loli.common.pojo;

import java.util.List;

public class DataTableJSONResponse {
    private Object sEcho;
    //查询记录数
    private Object iTotalRecords;
    //过滤的记录数
    private Object iTotalDisplayRecords;
    private List<?> aaData;

    public DataTableJSONResponse(List<?> aaData) {
        super();
        this.aaData = aaData;
    }

    public DataTableJSONResponse(Object sEcho, Object iTotalRecords, Object iTotalDisplayRecords, List<?> aaData) {
        this.sEcho = sEcho;
        this.iTotalRecords = iTotalRecords;
        this.iTotalDisplayRecords = iTotalDisplayRecords;
        this.aaData = aaData;
    }

    public DataTableJSONResponse() {
    }

    public Object getsEcho() {
        return sEcho;
    }

    public void setsEcho(Object sEcho) {
        this.sEcho = sEcho;
    }

    public Object getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(Object iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public Object getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(Object iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public List<?> getAaData() {
        return aaData;
    }

    public void setAaData(List<?> aaData) {
        this.aaData = aaData;
    }

    @Override
    public String toString() {
        return "DataTableJSONResponse{" +
                "sEcho=" + sEcho +
                ", iTotalRecords=" + iTotalRecords +
                ", iTotalDisplayRecords=" + iTotalDisplayRecords +
                ", aaData=" + aaData +
                '}';
    }
}
