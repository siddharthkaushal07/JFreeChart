/*
 * package in.co.rays.histogramEx;
 * 
 * import java.text.DecimalFormat;
 * 
 * import org.jfree.chart.JFreeChart; import org.jfree.chart.block.BlockBorder;
 * import org.jfree.chart.labels.StandardPieSectionLabelGenerator; import
 * org.jfree.chart.plot.RingPlot; import org.jfree.chart.title.TextTitle; import
 * org.jfree.ui.RectangleEdge; import org.jfree.ui.RectangleInsets;
 * 
 * import javafx.scene.effect.Light.Point; import javafx.scene.paint.Color;
 * import javafx.scene.text.Font;
 * 
 * public class donutChart {
 * 
 * public static void main(String[] args) { RingPlot plot = new
 * RingPlot(dataset); StringBuffer chartFileName = new
 * StringBuffer(Integer.toString(generatedCharts)).append(Long.toString(System.
 * currentTimeMillis())).append(".png");
 * 
 * JFreeChart chart = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, plot,
 * true); chart.setBackgroundPaint(new GradientPaint(new Point(0, 0), new
 * Color(20, 20, 20), new Point(400, 200), Color.DARK_GRAY));
 * 
 * TextTitle t = chart.getTitle();
 * t.setHorizontalAlignment(org.jfree.ui.HorizontalAlignment.LEFT);
 * t.setPaint(new Color(240, 240, 240)); t.setFont(new Font("Arial", Font.BOLD,
 * 26));
 * 
 * plot.setBackgroundPaint(null); plot.setOutlineVisible(false);
 * plot.setLabelGenerator(null); plot.setSectionDepth(0.35);
 * plot.setSectionOutlinesVisible(false); plot.setSimpleLabels(true);
 * plot.setShadowPaint(null); plot.setOuterSeparatorExtension(0);
 * plot.setInnerSeparatorExtension(0); plot.setLabelGenerator(new
 * StandardPieSectionLabelGenerator("{1}",new DecimalFormat("#,##0"), new
 * DecimalFormat("0.000%"))); plot.setLabelBackgroundPaint(null);
 * plot.setLabelOutlinePaint(null);
 * 
 * Font font=new Font("",0,16); plot.setLabelFont(font);
 * 
 * chart.getLegend().setFrame(BlockBorder.NONE);
 * chart.getLegend().setPosition(RectangleEdge.BOTTOM);
 * chart.setBackgroundPaint(java.awt.Color.white); chart.setPadding(new
 * RectangleInsets(4, 8, 2, 2)); }
 * 
 * }
 */