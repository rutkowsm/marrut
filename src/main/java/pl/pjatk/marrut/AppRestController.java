package pl.pjatk.marrut;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marrutapp")

public class AppRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
//        return ResponseEntity.ok("Hello WOrld");
        ResponseEntity<String> hello_world = ResponseEntity.ok("Helloo World!");
        ResponseEntity.BodyBuilder ok = ResponseEntity.ok();
        ResponseEntity<Object> build = ResponseEntity.ok().build();

        return hello_world;
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(new Car("Forester"));
    }

    @GetMapping("/test/{message}")
    public ResponseEntity<String> printMessage(@PathVariable String message) {
        return ResponseEntity.ok(message);
    }

    @GetMapping("/test/hellovalue")
    public ResponseEntity<String> printValue(@RequestParam String value) {
        return ResponseEntity.ok(value);
    }

    @GetMapping("/test/params")
    @ResponseBody
    public String getParam(@RequestParam List<String> par1) {
        return "Pars: " + par1;
    }

    @GetMapping("/car")
    public ResponseEntity<Car> getCarDetails(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

}
