package com.attextra.grafico.builder;

import com.attextra.grafico.decorator.LegendaDecorator;
import com.attextra.grafico.decorator.OrientacaoDecorator;
import org.jfree.chart.plot.PlotOrientation;

public class GraficoBarraVerticalBuilder extends GraficoBuilder {

    @Override
    public void alteraOrientacao() throws CloneNotSupportedException {
        grafico = new OrientacaoDecorator(grafico, PlotOrientation.VERTICAL);
    }

    @Override
    public void insereLegenda() throws CloneNotSupportedException {
        grafico = new LegendaDecorator(grafico, true);
    }

}
