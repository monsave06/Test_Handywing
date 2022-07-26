package demo.demo.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/address")
    public List<Address> getAddress(@RequestBody AddressRequest adr ) throws Exception {
        return addressService.getAddress(adr);
    }

}
