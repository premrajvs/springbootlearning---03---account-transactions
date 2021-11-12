package com.performanceengineering.customertransactions.controller;

import java.util.Collections;
import java.util.List;

import com.performanceengineering.customertransactions.model.customertransactionsmodel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounttransactions")
public class customertransactionscontroller {

    @RequestMapping("/{accId}")
    public List<customertransactionsmodel> getAccountTransactions(@PathVariable("accId") String accId) {
        return Collections.singletonList(new customertransactionsmodel(accId, "tr-001-000-112"));
    }
}
