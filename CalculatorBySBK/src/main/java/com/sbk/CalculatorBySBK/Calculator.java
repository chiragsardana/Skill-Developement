package com.sbk.CalculatorBySBK;

import com.sbk.Interfaces.*;

public class Calculator implements ICalulator{

	@Override
	public Integer addition(String expression) {
		// TODO Auto-generated method stub
		Integer sum = 0;
		for (String expr : expression.split("\\+")) {
			sum += Integer.parseInt(expr);
		}
		return sum;
	}

	@Override
	public Integer subtraction(String expression) {
		// TODO Auto-generated method stub
		Integer sum = 0;
		for (String expr : expression.split("\\-")) {
			if(sum == 0) {
				sum = Integer.parseInt(expr);
				continue;
			}
			sum -= Integer.parseInt(expr);
		}
		return sum;
	}

	@Override
	public Integer multiplication(String expression) {
		// TODO Auto-generated method stub
		Integer sum = 1;
		for (String expr : expression.split("\\*")) {
			sum *= Integer.parseInt(expr);
		}
		return sum;
	}

	@Override
	public Integer division(String expression) {
		// TODO Auto-generated method stub
		Integer sum = 0;
		for (String expr : expression.split("\\/")) {
			if(sum == 0) {
				sum = Integer.parseInt(expr);
				continue;
			}
			sum /= Integer.parseInt(expr);
		}
		return sum;
	}

	@Override
	public Integer modulu(String expression) {
		// TODO Auto-generated method stub
		Integer sum = 0;
		for (String expr : expression.split("\\%")) {
			if(sum == 0) {
				sum = Integer.parseInt(expr);
				continue;
			}
			sum %= Integer.parseInt(expr);
		}
		return sum;
	}

}
