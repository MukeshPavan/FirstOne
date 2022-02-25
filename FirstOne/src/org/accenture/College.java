package org.accenture;

public class College {
    int cid;
    String cname;
    String university;

    public College(int cid, String cname, String university) {
        this.cid = cid;
        this.cname = cname;
        this.university = university;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "College{" + "cid=" + cid + ", cname='" + cname + '\'' +
                ", university='" + university + '\'' + '}';
    }
}
