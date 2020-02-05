package dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DemoResource {

	@RequestMapping("/hello")
	  public String index() {
		System.out.println("Hello Docker added log message ");
	    return "hello docker - added log message";
	  }
}
