package com.example.cc1bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cc1bank.model.Bank;
import com.example.cc1bank.service.BankService;

@RestController

public class BankController {
    @Autowired
    BankService bs;
    @PostMapping("/api/bank")
    public ResponseEntity<Bank> adddata(@RequestBody Bank b)
    {
        Bank object=bs.create(b);
        return new ResponseEntity<>(object,HttpStatus.CREATED);
    }
    @GetMapping("/api/bank")
    public ResponseEntity<List<Bank>> getAll()
    {
         try
         {
              List<Bank> b=bs.getAll();
              return new ResponseEntity<>(b,HttpStatus.OK);
         }
         catch(Exception e)
         {
               return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
         }

    }
    @GetMapping("/api/bank/{accountNumber}")
    public ResponseEntity<Optional<Bank>> getById(@PathVariable("accountNumber")int accountNumber)
    {
        try
        {
            return new ResponseEntity<>(bs.getByid(accountNumber),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/api/bank/{accountNumber}")
    public ResponseEntity<Bank> putMethod(@PathVariable("accountNumber") int accountNumber,@RequestBody Bank bd)
    {
        if(bs.updateDetails(accountNumber,bd) == true)
        {
            return new ResponseEntity<>(bd,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/api/bank/{accountNumber}")
    public ResponseEntity<Boolean> delete(@PathVariable("accountNumber") int accountNumber)
    {
        if(bs.deleteEmployee(accountNumber) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}
    

