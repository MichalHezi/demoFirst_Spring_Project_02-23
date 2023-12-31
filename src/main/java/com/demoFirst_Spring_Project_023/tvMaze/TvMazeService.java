package com.demoFirst_Spring_Project_023.tvMaze;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "tvMazeService",
        url = "${tvmaze.url}"
)
public interface TvMazeService {

    @GetMapping(path = "shows/{id}")
    Show getTvShowById(@PathVariable Integer id);


}
