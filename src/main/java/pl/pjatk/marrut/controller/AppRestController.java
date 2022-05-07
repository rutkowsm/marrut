package pl.pjatk.marrut.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.marrut.Car;

import java.util.List;


@RestController
@RequestMapping("/marrutapp")

public class AppRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
//        return ResponseEntity.ok("Hello World");
        ResponseEntity<String> hello_world = ResponseEntity.ok("Hello World!");
        ResponseEntity.BodyBuilder ok = ResponseEntity.ok();
        ResponseEntity<Object> build = ResponseEntity.ok().build();

        return hello_world;
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(new Car("Forester"));
    }

    @GetMapping("create")
    public ResponseEntity<Car> createCar(){return ResponseEntity.ok(new Car("S-Cross"));}

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

    @GetMapping("/hello/exception")
        public ResponseEntity<String> exception() {
            throw new RuntimeException("Testing RestControllerAdvice");
        }


}
