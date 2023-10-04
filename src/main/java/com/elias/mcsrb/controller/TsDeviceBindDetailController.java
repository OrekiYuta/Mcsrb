package com.elias.mcsrb.controller;

import com.elias.mcsrb.entity.TsDeviceBindDetail;
import com.elias.mcsrb.mapper.TsDeviceBindDetailMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/tsDeviceBindDetail")
public class TsDeviceBindDetailController {

    final TsDeviceBindDetailMapper tsDeviceBindDetailMapper;

    public TsDeviceBindDetailController(TsDeviceBindDetailMapper tsDeviceBindDetailMapper) {
        this.tsDeviceBindDetailMapper = tsDeviceBindDetailMapper;
    }

    @GetMapping("hello")
    public String testMybatisPlusResponse() {
        return "Hello Mybatis Plus";
    }

    @GetMapping("searchTsDeviceBindDetail")
    public List searchTsDeviceBindDetail() {
        List<TsDeviceBindDetail> tsDeviceBindDetails = tsDeviceBindDetailMapper.selectList(null);
        return tsDeviceBindDetails;
    }
}
