package com.hmittag.AppUpdateAlert.AppVersion;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppVersionRepository extends MongoRepository<AppVersion, String> {

}
