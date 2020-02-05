package com.yashwanth.EPAM_Task1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList  <Sweets> sweets = new LinkedList<Sweets>();
        Scanner in = new Scanner(System.in);
        sweets.add(new Sweets("c1",50,50) {
			@Override
			String getType() {
				// TODO Auto-generated method stub
				return "candy";
				}
		});
        sweets.add(new Sweets("chocolate1",5,7) {
			@Override
			String getType() {
				// TODO Auto-generated method stub
				return "chocolate";
				}
		});
        sweets.add(new Sweets("c2",80,90) {
			@Override
			String getType() {
				// TODO Auto-generated method stub
				return "candy";
				}
		});
        sweets.add(new Sweets("chocolate2",150,120) {
			@Override
			String getType() {
				// TODO Auto-generated method stub
				return "chocolate";
				}
		});
        sweets.add(new Sweets("c3",100,250) {
			@Override
			String getType() {
				// TODO Auto-generated method stub
				return "candy";
				}
		});
        sweets.add(new Sweets("chocolate3",100,250) {
			@Override
			String getType() {
				// TODO Auto-generated method stub
				return "chocolate";
				}
		});
        
        Gift newyear = new Gift(sweets);
        
        Integer tw = newyear.sumofWeights();
        
        System.out.println("Total Weigths" + tw);
        
        newyear.sortChocolates("weight");
        
        for(Sweets s: newyear.sweets) {
        	if(s.getType().equals("chocolate")) 
        		System.out.println(s.name);
        }
        
        int lowlimit,highlimit;
        System.out.println("Enter lower and higher limit for cost of candies: ");
        lowlimit= in.nextInt();
        highlimit=in.nextInt();
        
        for(Sweets s: newyear.sweets) {
        	if(s.getType().equals("candy") && s.cost>lowlimit && s.cost<highlimit) 
        		System.out.println(s.name);
        }
        
        
    }
}
