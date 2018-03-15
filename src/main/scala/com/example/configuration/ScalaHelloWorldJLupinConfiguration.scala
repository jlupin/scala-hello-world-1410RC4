package com.example.configuration

import com.jlupin.impl.container.application.spring.{JLupinAbstractSpringApplicationContainer}
import com.jlupin.interfaces.configuration.microservice.container.application.{JLupinAbstractApplicationContainerProducer}
import org.springframework.context.annotation.{AnnotationConfigApplicationContext}
import org.springframework.context.support.{AbstractApplicationContext}

class ScalaHelloWorldJLupinConfiguration extends JLupinAbstractApplicationContainerProducer {
    def produceJLupinApplicationContainer = new JLupinAbstractSpringApplicationContainer {
        def getAbstractApplicationContext = {
            new AnnotationConfigApplicationContext(classOf[ScalaHelloWorldSpringConfiguration]).asInstanceOf[AbstractApplicationContext]
        }
    }
}