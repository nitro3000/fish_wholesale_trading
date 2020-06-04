package com.go2it.fish_wholesale_trading;

import com.go2it.fish_wholesale_trading.entity.Country;
import com.go2it.fish_wholesale_trading.entity.User;
import com.go2it.fish_wholesale_trading.entity.WorldRegion;
import com.go2it.fish_wholesale_trading.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
        IWorldRegionService worldRegionService = context.getBean (IWorldRegionService.class);
        ICountryService countryService = context.getBean (ICountryService.class);
        IDeliveryMethodService deliveryMethodService= context.getBean (IDeliveryMethodService.class);
        ILocationService locationService=context.getBean (ILocationService.class);
        IOrderService orderService=context.getBean (IOrderService.class);
        IOrderDetailService orderDetailService=context.getBean (IOrderDetailService.class);
        IPaymentService paymentService=context.getBean (IPaymentService.class);
        IProductService productService=context.getBean (IProductService.class);
        IRoleService roleService=context.getBean (IRoleService.class);
        IShipmentService shipmentService=context.getBean (IShipmentService.class);
        IUserService userService=context.getBean (IUserService.class);
        IWarehouseService warehouseService=context.getBean (IWarehouseService.class);

 //++++++++++++++  WorldRegion save +++++++++++++
//        WorldRegion wR = new WorldRegion ();
//        wR.setRegionName ("testRegionName");
//        worldRegionService.save (wR);
//        System.out.println ("Region name: "+wR.getRegionName ()+"; "+"Region ID: " + wR.getWorldRegionId () );

//++++++++++++++  Country save +++++++++++++
//        Country country = new Country ();
//        country.setCountryName ("testCountryName");
//        country.setWorldRegion (wR);
//        countryService.save (country);
//        System.out.println ("Country ID: " +country.getCountryId ()+"; Country name: "+country.getCountryName ());
//++++++++++++++  Country getAll +++++++++++++
//        List<Country> countryList = countryService.getAll ();
//        for (Country country:countryList){
//            System.out.println (country );
//        }
//++++++++++++++  Country find by id +++++++++++++
//        Country c1=countryService.finById (3);
//        System.out.println (c1.getCountryName () );



    }
}
