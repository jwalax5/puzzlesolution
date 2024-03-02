package com.puzzlesolution.Controller;


import com.puzzlesolution.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping("/")
    public String greeting(){
        return "Hello nice to meet you!";
    }

    @GetMapping("/getBoard")
    public Board getBoard(){
        return new Board(Board.Size.NORMAL);
    }
}
