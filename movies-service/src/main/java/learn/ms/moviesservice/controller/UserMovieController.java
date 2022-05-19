package learn.ms.moviesservice.controller;

import learn.ms.moviesservice.model.Movie;
import learn.ms.moviesservice.model.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserMovieController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{id}")
    public List<Movie> movies(@PathVariable("id") String userId){

        List<Integer> movieIds = new ArrayList<>();
        movieIds.add(1);
        movieIds.add(2);
        movieIds.add(3);

        List<Movie> list = new ArrayList<Movie>();
        movieIds.forEach(
                mid -> {
                    MovieInfo movieInfo = restTemplate.getForObject("http://MOVIES-INFO-SERVICE/movie/"+mid, MovieInfo.class);
                    list.add(new Movie(movieInfo.getId(), movieInfo.getName(), "great story", 4.5f, movieInfo.getYear()));
                    System.out.println(movieInfo);
                }
        );

        list.add(new Movie(2, "RRR", "great story", 4.5f, 2022));

        return list;

    } 
    
}
