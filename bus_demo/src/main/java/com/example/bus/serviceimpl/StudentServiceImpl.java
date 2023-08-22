package com.example.bus.serviceimpl;

import com.example.bus.entity.Bus;
import com.example.bus.repository.BusRepo;
import com.example.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements BusService {
    @Autowired
    BusRepo bRepo;

    @Override
    public Bus save(Bus busId) {
        return bRepo.save(busId);
    }

    @Override
    public List<Bus> getAll() {
        return bRepo.findAll();
    }

    @Override
    public Bus updatestd(Long id, Bus bus) {
        return bRepo.save(bus);
    }

    @Override
    public String deletebyID(Long id) {
        bRepo.deleteById(id);
        return "deleted!";
    }
}
