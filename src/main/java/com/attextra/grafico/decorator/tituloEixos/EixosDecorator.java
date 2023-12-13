package com.attextra.grafico.decorator.tituloEixos;

import com.attextra.grafico.decorator.GraficoDecorator;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import com.attextra.grafico.decorator.IGrafico;


public class EixosDecorator extends GraficoDecorator {

    public EixosDecorator(IGrafico grafico, boolean comEixos) throws CloneNotSupportedException {
        super(grafico);
        novoGrafico = (JFreeChart) elementoDecorado.getGrafico().clone();
        CategoryPlot plot = novoGrafico.getCategoryPlot();

        if (!comEixos) {
            plot.getDomainAxis().setLabel("");
            plot.getRangeAxis().setLabel("");
        } else {
            EixosPresenter eixoPresenter = new EixosPresenter(grafico);
            plot.getDomainAxis().setLabel(eixoPresenter.getEixoX());
            plot.getRangeAxis().setLabel(eixoPresenter.getEixoY());
        }

    }

    @Override
    public JFreeChart getGrafico() {
        return novoGrafico;
    }

}
