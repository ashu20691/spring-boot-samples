@Controller
class Example {
        @RequestMapping("/list")
	@ResponseBody
	public Map list() {	// automatic json reference
		[persons: [new Person(id:10, name:"Bhagwat"), new Person(id:20, name:'Kumar')]]
	}
}

class Person{
int id
String name
}
