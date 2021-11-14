package com.performanceengineering.customertransactions.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.performanceengineering.customertransactions.model.accounttransactionsmodel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounttransactions")
public class accounttransactionscontroller {

    @RequestMapping("/{accId}")
    public List<accounttransactionsmodel> getAccountTransactions(@PathVariable("accId") String accId) {
        return Arrays.asList(new accounttransactionsmodel(accId, "tr-001-000-111", 52, "11-13-2021"),
                new accounttransactionsmodel(accId, "tr-002-000-112", 27, "11-13-2021"),
                new accounttransactionsmodel(accId, "tr-003-000-113", 12, "11-13-2021"));
    }
}
