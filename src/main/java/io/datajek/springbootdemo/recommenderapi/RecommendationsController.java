package io.datajek.springbootdemo.recommenderapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationsController {

    @RequestMapping(method= RequestMethod.GET, value="/movies")
    public List<Movie> getAllMovies() {
        return Arrays.asList(
                                new Movie(2, "Happy Feet", 1),
                                new Movie(3, "Shark Tales", 6.0));

    }
}
