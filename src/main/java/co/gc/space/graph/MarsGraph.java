package co.gc.space.graph;

import java.util.ArrayList;

public class MarsGraph extends Graph {

	private long moneyFormula(long startingPoint, long i) {
		return (long) (((double) startingPoint) * (1.0 / Math.pow((i + 1), 2.2)));
	}

	private ArrayList<Object> money(long startingPoint, int numPoints) {
		ArrayList<Object> returnMoney = new ArrayList<>();
		for (long i = 0; i < numPoints; ++i) {
			returnMoney.add(moneyFormula(startingPoint, i));

		}
		return returnMoney;
	}

	private ArrayList<Object> years(int year, int times) {
		ArrayList<Object> yearReturn = new ArrayList<>();
		for (int i = 0; i < times; ++i) {
			yearReturn.add(year + (i * 10));
		}
		return yearReturn;
	}

	public MarsGraph() {
		titleName = "Price Projections of Sending a Shuttle To Mars";
		xName = "Year";
		yName = "Price ($ Billion)";
		xPoints = years(2020, 7);
		yPoints = money(500_000_000_000l, xPoints.size());

	}
}
