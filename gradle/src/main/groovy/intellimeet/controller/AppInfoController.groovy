package intellimeet.controller

import intellimeet.beans.AppConfig;
import intellimeet.beans.AppInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppInfoController{

    @Autowired
    AppInfo appInfo

    @Autowired
    AppConfig appConfig

    @RequestMapping("appinfo")
    Map getAppInfo(){
        Map map = new HashMap()
        map.put("name",appInfo.name)
        map.put("version",appInfo.version)
        return map
    }

    @RequestMapping("appConfig")
    Map getAppConfig(){
        Map map = new HashMap()
        map.put("port",appConfig.port)
        map.put("name",appConfig.name)
        map.put("appname",appConfig.appName)
        return map
    }
}