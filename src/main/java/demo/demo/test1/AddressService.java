package demo.demo.test1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    public List<Address> getAddress(AddressRequest adq){
        List<Address> addresses =new ArrayList<>();

       for(int i =0 ;i < adq.getAddressText().length ;i++){
       String[] test = adq.getAddressText()[i].split(" ");

           Address address = new Address();

           try{
               address.setNumber(test[0]);
               address.setMoo(test[1]);
               address.setParish(test[2]);
               address.setDistrict(test[3]);
               address.setProvince(test[4]);
               address.setCode(test[5]);
               address.setTel(test[6]);

           }catch (Exception e){
               address.setParish(test[2].substring(test[2].indexOf("ตำบล"),test[2].indexOf("อำเภอ")));
               address.setDistrict(test[2].substring(test[2].indexOf("อำเภอ"),test[2].indexOf("จังหวัด")));
               address.setProvince(test[2].substring(test[2].indexOf("จังหวัด"),test[2].length()-5));
               address.setCode(test[2].substring(test[2].length()-5));
               address.setTel(test[3]);
           }

           addresses.add(address);
       }

        return addresses;
    }
}
