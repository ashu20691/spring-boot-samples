@Grab('spring-boot-starter-jetty')

@Controller
class ThisWillActuallyRun {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        "Hello World!"
    }

}
