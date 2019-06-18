package lab7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lab7.model.Date;
import lab7.model.DateStorage;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    DateStorage dateStorage;

    @RequestMapping(value = "/dates", method = RequestMethod.GET)
    public List<Date> getDates() {
        return dateStorage.fetchList();
    }

    @RequestMapping(value = "/dates", method = RequestMethod.POST)
    public void postDate(
            @RequestParam Integer year,
            @RequestParam Integer month,
            @RequestParam Integer day
    ) {
        Date date = new Date(year, month, day);

        dateStorage.add(date);
    }

    @RequestMapping(value = "/dates", method = RequestMethod.DELETE)
    public void deleteDate(@RequestParam Integer index) {
        dateStorage.remove(index);
    }
}
