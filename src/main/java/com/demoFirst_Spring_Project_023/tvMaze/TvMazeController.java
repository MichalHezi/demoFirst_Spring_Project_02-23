package com.demoFirst_Spring_Project_023.tvMaze;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tvShow")
public class TvMazeController {
    @Autowired
    private TvMazeService tvMazeService;
    @GetMapping
    public Show getShowById(@RequestParam Integer id){
        return tvMazeService.getTvShowById(id);
    }
}
