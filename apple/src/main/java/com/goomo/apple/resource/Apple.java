package com.goomo.apple.resource;

import com.goomo.apple.Device;
import com.goomo.apple.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @RequestMapping("/devices")
    public Devices getDevices()
    {
        List<Device> devices=new ArrayList<>();
           devices.add(new Device("iPhone 3G ", "Bootrom Rev.2"));
        devices.add(new Device("iPhone 3GS", "BCGA1241 Smartphone"));
        devices.add(new Device("iPhone 4 ", "Bootrom 574.4"));
        devices.add(new Device("iPhone 4S ", "Bootrom 838.3"));
        Devices deviceList=new Devices(devices);

           return deviceList;
    }
}
