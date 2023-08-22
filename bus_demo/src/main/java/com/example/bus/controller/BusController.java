package com.example.bus.controller;

import com.example.bus.entity.Bus;
import com.example.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {

    @Autowired
    BusService bService;

    @PostMapping("/bus")
    public ResponseEntity<Bus> save(@RequestBody Bus busId) {
        return ResponseEntity.ok().body(this.bService.save(busId));
    }

    @GetMapping("/getAll")
    public List<Bus> getAll() { return this.bService.getAll(); }

    @PutMapping("/update/{id}")
    public Bus update(@PathVariable("id") Long id, @RequestBody Bus bus)
    {
        return this.bService.update(id, bus);
    }

    @DeleteMapping("/deletebyID/{id}")
    public String deletebyID(@PathVariable("id") Long id)
    {
        return this.bService.deletebyID(id);
    }
}
