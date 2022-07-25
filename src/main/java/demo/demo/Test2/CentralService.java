package demo.demo.Test2;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CentralService {
    private int money ;
    private int hoursStart,MinutesStart,hoursEnd,MinutesEnd,discount;
    private double result ,timeResult;

    public int calCentral(@NotNull CentralRequest centralRequest) throws ParseException {

        SimpleDateFormat sdfDate = new SimpleDateFormat("hh:mm:ss");
        Date now = new Date();
        java.text.DateFormat df = new java.text.SimpleDateFormat("hh:mm:ss");
        Date date1 = df.parse(centralRequest.getTextTimeStart());
        Date date2 = df.parse(centralRequest.getTextTimeEnd());

        System.out.println(date1);
        System.out.println(date2);

        long diff = date2.getTime() - date1.getTime();
        int timeInSeconds = (int) (diff / 1000);
        int hours, minutes;

        hours = timeInSeconds / 3600;
        timeInSeconds = timeInSeconds - (hours * 3600);
        minutes = timeInSeconds / 60;
        System.out.println("hours  "+hours+"  minutes "+minutes);

        if( hours >= 6 && minutes >= 0){
            discount =40 ;
            if(minutes >0){
                money = ((((hours+1)-4)*50)+40)-discount;
            }else{
                money = (((hours-4)*50)+40)-discount;
            }
        }else if( hours == 4 && minutes >=25){
            discount = 20 ;
            money =((((hours+1)-4)*50)+40)-discount;
        }else if(hours > 4 && minutes >=0 ){
            discount =20 ;
            if(minutes > 0){
              money = ((((hours+1)-4)*50)+40)-discount;
            }else{
                money = (((hours-4)*50)+40)-discount;
            }
        }else{
            money = 40 ;
        }
        return money;
    }
}
