package com.pushpey.demorest4.controllers;

import com.pushpey.demorest4.models.Appointment;
import com.pushpey.demorest4.services.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;
    public  AppointmentController(AppointmentService appointmentService){
        this.appointmentService = appointmentService;
    }

    @PostMapping("/book")
    public Appointment bookAppointment(@RequestParam Long patientId,
                                       @RequestParam Long doctorId) {
        return appointmentService.bookAppointment(patientId, doctorId);
    }

//    @PostMapping
//    public Appointment create(@RequestBody Appointment appointment){
//        return appointmentService.create(appointment);
//    }

    @GetMapping
    public List<Appointment> getAll(){
        return appointmentService.getAll();
    }
    @GetMapping("/{id}")
    public Appointment getById(@PathVariable Long id ){
        return appointmentService.getById(id);
    }
    @DeleteMapping("?{id}")
    public void delete(@PathVariable Long id ){
        appointmentService.delete(id);
    }
}
