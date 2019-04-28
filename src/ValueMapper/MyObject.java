package ValueMapper;

import java.util.Date;

public class MyObject {
    Integer ww;
    String reclaimId;
    Long cycleId;
    Boolean sevenDays;
    String type;
    private Date eventDatetime;

    public Date getEventDatetime() {
        return eventDatetime;
    }

    public void setEventDatetime(Date eventDatetime) {
        this.eventDatetime = eventDatetime;
    }

    public Integer getWw() {
        return ww;
    }

    public void setWw(Integer ww) {
        this.ww = ww;
    }

    public String getReclaimId() {
        return reclaimId;
    }

    public void setReclaimId(String reclaimId) {
        this.reclaimId = reclaimId;
    }

    public Long getCycleId() {
        return cycleId;
    }

    public void setCycleId(Long cycleId) {
        this.cycleId = cycleId;
    }

    public Boolean isSevenDays() {
        return sevenDays;
    }

    public void setSevenDays(boolean sevenDays) {
        this.sevenDays = sevenDays;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
