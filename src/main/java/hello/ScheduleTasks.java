package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTasks {

	Logger logger = Logger.getLogger(ScheduleTasks.class);
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate=5000)
	public void scheduleTask() {
		logger.info("Current time is :" + dateFormat.format(new Date()));
	}
}
