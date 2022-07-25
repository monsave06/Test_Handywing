package demo.demo.Test2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CentralController {

    @Autowired
    private CentralService centralService;

    @PostMapping(value = "/central")
    public int calculation(@RequestBody CentralRequest centralRequest ) throws Exception {

        return  centralService.calCentral(centralRequest);
    }

}
