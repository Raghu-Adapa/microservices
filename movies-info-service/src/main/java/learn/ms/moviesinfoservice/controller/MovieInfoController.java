package learn.ms.moviesinfoservice.controller;

import learn.ms.moviesinfoservice.model.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieInfoController {

    @RequestMapping("/{id}")
    public MovieInfo getMovieInformation(@PathVariable("id") String movieId){

        System.out.println("Movie Id : "+ movieId);

        MovieInfo movie = new MovieInfo(1, "RadheShyam", 2022);

        return movie;
    }
}
