package com.hmittag.AppUpdateAlert.AppVersion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppVersionService {
    //region fields
    private AppVersionRepository appVersionRepository;
    //endregion

    //region constructor
    @Autowired
    public AppVersionService(final AppVersionRepository appVersionRepository) {
        this.appVersionRepository = appVersionRepository;
    }
    //endregion

    //fetch current
    public AppVersion getCurrentVersion()   {
        List<AppVersion> versions = appVersionRepository.findAll();
        try {
            return versions.get(0);
        }
        catch (NullPointerException | IndexOutOfBoundsException e)  {
            return null;
        }
    }

    public List<AppVersion> getCurrentVersions()   {
        return appVersionRepository.findAll();
    }

    //save
    public AppVersion save(AppVersion version)  {
        return appVersionRepository.save(version);
    }

    //delete
    public void delete(String id)   {
        appVersionRepository.deleteById(id);
    }
}
