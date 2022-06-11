package com.hmittag.AppUpdateAlert.AppVersion;

import com.hmittag.AppUpdateAlert.AppVersion.ExceptionHandling.AppVersionNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AppVersionController {
    private static final String PATH_V1 = "api/v1/";

    //region fields
    // repo
    private AppVersionService appVersionService;
    //endregion

    //region constructor
    @Autowired
    public AppVersionController(final AppVersionService appVersionService) {
        this.appVersionService = appVersionService;
    }
    //endregion

    //region mapping
    @GetMapping(path = PATH_V1 + "currentAppVersion")
    public AppVersion getCurrentVersion()   {
        //return new ArrayList<>();
        AppVersion appVersion = appVersionService.getCurrentVersion();
        if (appVersion == null) {
            throw new AppVersionNotFoundException();
        }
        return appVersionService.getCurrentVersion();
    }


    @PostMapping(path = PATH_V1 + "currentAppVersion")
    public ResponseEntity<AppVersion> setCurrentVersion(@RequestBody AppVersion appVersion) {
        AppVersion savedVersion = appVersionService.save(appVersion);
        if (savedVersion == null)   {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = PATH_V1 + "currentAppVersion/{id}")
    public void deleteCurrentVersion(@PathVariable String id) {
        appVersionService.delete(id);
    }
    //endregion

}
