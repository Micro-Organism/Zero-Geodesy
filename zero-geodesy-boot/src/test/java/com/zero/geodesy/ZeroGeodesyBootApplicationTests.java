package com.zero.geodesy;

import com.zero.geodesy.common.util.GeodsyDistanceUtils;
import com.zero.geodesy.common.util.MathDistanceUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ZeroGeodesyBootApplicationTests {

    @BeforeEach
    public void before()  {
        log.info("init some data");
    }

    @AfterEach
    public void after(){
        log.info("clean some data");
    }

    @Test
    public void execute()  {
        log.info("your method test Code");
    }

    @Test
    public void getDistance() {
        // source （113.324553,23.106414）
        // target （121.499718, 31.239703）
        double distance1 = GeodsyDistanceUtils.getDistance(113.324553,23.106414, 121.499718, 31.239703,2);
        System.out.println("distant1（m）：" + distance1);
        double distance2 = MathDistanceUtil.getDistance(113.324553, 23.106414, 121.499718, 31.239703);
        System.out.println("distant2（m）：" + distance2);
    }

}
