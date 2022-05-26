package in.co.rays.histogramEx;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

@WebServlet(name = "DoChart", urlPatterns = { "/DoChart" })
public class DoChart extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("image/png");

		OutputStream outputStream = response.getOutputStream();

		JFreeChart chart = getChart();

		int width = 500;
		int height = 350;

		ChartUtils.writeChartAsPNG(outputStream, chart, width, height);
	}

	public JFreeChart getChart() {

		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Rays Technologies", 88);
		dataset.setValue("Others", 12);

		JFreeChart chart = ChartFactory.createPieChart("", dataset, true, false, false);
		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setSectionPaint(1, Color.red);
		
		ChartPanel chartPanel = new ChartPanel(chart, false);
		chart.getPlot().setBackgroundPaint( Color.WHITE );

		/*
		 * CategoryPlot p = chart.getCategoryPlot();
		 * p.setRangeGridlinePaint(Color.black);
		 */

		/* chart.setBorderVisible(false); */

		return chart;
	}
}
