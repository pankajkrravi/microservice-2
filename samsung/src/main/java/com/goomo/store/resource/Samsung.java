package com.goomo.store.resource;

import com.goomo.store.model.Device;
import com.goomo.store.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @RequestMapping("/devices")
    public Devices getDevices()
    {
        List<Device> devices=new ArrayList<>();
           devices.add(new Device("Note 9 ", "Smartphone"));
        devices.add(new Device("Note 9 ", "Smartphone"));
        devices.add(new Device("S 10 ", "Smartphone"));
        devices.add(new Device("Android ", "Smartphone"));
        Devices deviceList=new Devices(devices);

           return deviceList;
    }
}
