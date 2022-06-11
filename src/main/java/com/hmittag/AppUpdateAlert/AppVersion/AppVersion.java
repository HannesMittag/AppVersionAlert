package com.hmittag.AppUpdateAlert.AppVersion;

import org.springframework.data.annotation.Id;

public class AppVersion {
    //region fields
    @Id
    private String id;
    private int versionNumber;
    private String name;
    /**
     * severity:
     * 0: not severe (only small UI changes)
     * 1: medium (significant UI fixes)
     * 2: urgent (bug fixes)
     * 3: severe (severe bug fixes)
     */
    private int severity;
    //endregion

    //region constructor
    public AppVersion() {
    }

    public AppVersion(String id)    {
        this.id = id;
    }
    //endregion

    //region getter setter

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getVersionNumber() {
        return versionNumber;
    }
    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    //endregion

    //region override
    @Override
    public String toString() {
        return "AppVersion{" +
                "id='" + id + '\'' +
                ", versionNumber=" + versionNumber +
                ", name='" + name + '\'' +
                ", severity=" + severity +
                '}';
    }
    //endregion

}
