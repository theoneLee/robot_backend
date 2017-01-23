package web;

import bean.Environment;
import bean.Temp;
import dao.EnvironmentDAO;
import dao.TempDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lee on 2017/1/23 0023.
 */
@RestController
@RequestMapping("/temps")
public class TempControler {

    @Autowired
    private TempDAO tempDAO;

    @Autowired
    private EnvironmentDAO environmentDAO;



    //这里可以考虑加入一个key，value = "/{key}"
    @RequestMapping(method = RequestMethod.POST)
    public int saveTemp(@RequestBody Temp temp){
        //将这个temp转化为environment并储存在数据库
        return tempDAO.save(temp);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Environment> getList(){
        return environmentDAO.getAllList();
    }

}
