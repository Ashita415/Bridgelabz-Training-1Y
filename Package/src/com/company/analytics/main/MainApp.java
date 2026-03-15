package com.company.analytics.main;

import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

public class MainApp {

    public static void main(String[] args) {

        SalesReport sr = new SalesReport();
        EmployeeReport er = new EmployeeReport();

        System.out.println("Company Combined Report\n");

        sr.showSalesReport();
        System.out.println();
        er.showEmployeeReport();
    }
}