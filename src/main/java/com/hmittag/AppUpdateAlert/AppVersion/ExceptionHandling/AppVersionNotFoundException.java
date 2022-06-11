package com.hmittag.AppUpdateAlert.AppVersion.ExceptionHandling;

public class AppVersionNotFoundException extends RuntimeException   {
    public AppVersionNotFoundException()  {
        super("Could not find current app version");
    }
}
