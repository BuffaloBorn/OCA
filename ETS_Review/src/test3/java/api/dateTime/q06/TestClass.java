package test3.java.api.dateTime.q06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestClass {

	public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

	}

}

// Assuming that the current date on the system is 5th Feb, 2015, 
// which of the following will be a part of the output?

// Ans: None of the above.
// Actual output is as follows: 
//  2015-02-05
//	2015-02-05
//	2016-12-29


//