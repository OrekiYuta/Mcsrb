package java.com.elias.mcsrb.junit;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.elias.mcsrb.entity.TsDeviceBindDetail;
import com.elias.mcsrb.mapper.TsDeviceBindDetailMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author OrekiYuta
 * @description MybatisPlus Usage
 * @date 2023/5/24 18:04:55
 */
@SpringBootTest
@Slf4j
public class MybatisPlusTest {

    @Autowired
    TsDeviceBindDetailMapper tsDeviceBindDetailMapper;

    /**
     * @return void
     * @description Try to run MybatisPlus
     * @author OrekiYuta
     * @date 2023/5/24 18:05:33
     */
    @Test
    public void testMybatisPlusFirstRun() {
        log.info("Start: Test MybatisPlus first run");
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("device_name", "HUAWEI");  //写表中的列名
//        columnMap.put("device_model", "VCE-AL00");
        List<TsDeviceBindDetail> tsDeviceBindDetails = tsDeviceBindDetailMapper.selectByMap(columnMap);

        QueryWrapper<TsDeviceBindDetail> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("device_name", "HUAWEI");
//        queryWrapper.eq("device_model", "VCE-AL00");
        Long count = tsDeviceBindDetailMapper.selectCount(queryWrapper);

        assertNotNull(tsDeviceBindDetails);
        assertNotNull(count);
//        tsDeviceBindDetails.forEach(System.out::println);
        List<String> result = tsDeviceBindDetails.stream().map(TsDeviceBindDetail::getDeviceModel).collect(Collectors.toList());
        System.out.println(count + " >>> " + result);
        log.info("End: MybatisPlus first run");
    }

}
