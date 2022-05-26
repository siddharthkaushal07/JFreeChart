package in.co.rays.histogramEx;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class LineChartSimple {
	
	public static void main(String[] args) throws IOException {

		XYSeries series1 = new XYSeries("2022");
		series1.add(18, 530);
		series1.add(20, 580);
		series1.add(25, 740);
		series1.add(30, 901);
		series1.add(40, 1300);
		series1.add(50, 2219);

		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series1);

		JFreeChart chart = ChartFactory.createXYLineChart("Average salary per student", "Age", "Salary (€)", dataset,
				PlotOrientation.VERTICAL, true, true, false);

		ChartUtils.saveChartAsPNG(new File("E:\\testJfreeChart\\line_chart.png"), chart, 450, 400);
	}


}
