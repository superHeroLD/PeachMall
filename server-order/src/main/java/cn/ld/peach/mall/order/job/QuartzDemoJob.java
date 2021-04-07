package cn.ld.peach.mall.order.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * QuartzDemoJob
 *
 * @author lidong
 * @date 2021/4/7
 */
@Slf4j
@Component
public class QuartzDemoJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("[QuartzDemoJob] QuartzDemoJob is executed");
    }
}
