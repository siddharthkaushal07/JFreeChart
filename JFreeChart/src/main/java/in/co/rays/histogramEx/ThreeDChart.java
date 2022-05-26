package in.co.rays.histogramEx;

import java.io.File;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ThreeDChart {
	public static void main(String[] args) throws Exception {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Rays Technologies", new Double(80));
		dataset.setValue("Others", new Double(20));
		
		JFreeChart chart = ChartFactory.createPieChart3D("Institutions", // chart title
				dataset, // data
				true, // include legend
				true, false);

		final PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setStartAngle(270);
		plot.setForegroundAlpha(0.60f);
		plot.setInteriorGap(0.02);
		int width = 1100; /* Width of the image */
		int height = 480; /* Height of the image */
		File pieChart3D = new File("E:\\testJfreeChart\\pie_Chart3D.jpeg");
		ChartUtilities.saveChartAsJPEG(pieChart3D, chart, width, height);
	}
}
