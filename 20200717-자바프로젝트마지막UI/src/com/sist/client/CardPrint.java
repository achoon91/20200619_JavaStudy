package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.sist.data.*;
public class CardPrint extends JFrame{
    public CardPrint()
    {
    	//setLayout(null);
    	FoodHouseVO[] food=MainClass3.categoryFoodData();
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(10,1));
    	JScrollPane pp=new JScrollPane();
    	Dimension size = new Dimension();//사이즈를 지정하기 위한 객체 생성
    	size.setSize(1000, 600);//객체의 사이즈를 지정
    	p.setPreferredSize(size);//사이즈 정보를 가지고 있는 객체를 이용해 패널의 사이즈 지정
    	pp.setViewportView(p);
    	add("Center",pp);
    	
    	for(FoodHouseVO vo:food)
    	{
    		FoodListCard fc=new FoodListCard(vo);
    		p.add(fc);
    	}
    	
    	setSize(1300, 500);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CardPrint();
	}

}