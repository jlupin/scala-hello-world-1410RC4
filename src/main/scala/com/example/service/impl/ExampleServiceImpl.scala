package com.example.service.impl

import com.example.service.interface.{ExampleService}
import org.springframework.stereotype.Service

@Service(value = "exampleService")
class ExampleServiceImpl extends ExampleService {
	def hello(name : String) = "Hello, " + name + "!"
}