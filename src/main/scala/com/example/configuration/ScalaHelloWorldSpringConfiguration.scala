package com.example.configuration

import org.springframework.context.annotation.{Bean, ComponentScan, Configuration}
import scala.collection.JavaConverters._

@Configuration
@ComponentScan(Array("com.example"))
class ScalaHelloWorldSpringConfiguration {
    @Bean(name = Array("jLupinRegularExpressionToRemotelyEnabled"))
    def getRemotelyBeanList = {
        val list = List(
            "exampleService"
        )
        list.asJava
    }
}