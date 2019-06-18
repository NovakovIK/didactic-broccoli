package lab7.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("dateStorage")
public class DateStorageLogger extends DateStorage {
    Logger logger = LoggerFactory.getLogger(DateStorageLogger.class);

    @Override
    public void add(Date date) {
        logger.info("Adding date: " + date);
        super.add(date);
    }

    @Override
    public void remove(int index) {
        Date date = fetchList().get(index);
        logger.info("Removing date: " + date);
        super.remove(index);
    }
}
