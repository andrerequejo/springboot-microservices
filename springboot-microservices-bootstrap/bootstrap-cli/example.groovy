@RestController
public class Example {

	@RequestMapping("/")
	String hello() {
		return "Hellow World!"
	}
}