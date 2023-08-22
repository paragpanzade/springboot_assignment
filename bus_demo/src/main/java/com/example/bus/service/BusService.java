package com.example.bus.service;

import com.example.bus.entity.Bus;

import java.util.List;

public interface BusService {

    public Bus save(Bus busID);

    public List<Bus> getAll();

    public Bus update(Long id, Bus bus);

    public String deletebyID(Long id);
}
