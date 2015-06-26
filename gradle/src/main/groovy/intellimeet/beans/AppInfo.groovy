package intellimeet.beans

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "app")
class AppInfo {
//    @Value('${app.name}')
    String name

//    @Value('${app.version}')
    String version
}