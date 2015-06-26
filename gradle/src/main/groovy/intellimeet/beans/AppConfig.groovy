package intellimeet.beans

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class AppConfig {
    @Value('${app.name}')
    String appName

    @Value('${server.port}')
    Integer port


    @Value('${security.user.name}')
    String name
}