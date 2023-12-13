package com.attextra.grafico.decorator.titulo;

import com.attextra.grafico.decorator.GraficoDecorator;
import org.jfree.chart.JFreeChart;
import com.attextra.grafico.decorator.IGrafico;

public class TituloDecorator extends GraficoDecorator {

    public TituloDecorator(IGrafico grafico, boolean comTitulo) throws CloneNotSupportedException {
        super(grafico);
        novoGrafico = (JFreeChart) elementoDecorado.getGrafico().clone();
        if (!comTitulo) {
            novoGrafico.setTitle("");
        } else {
            TituloPresenter tituloView = new TituloPresenter(grafico);
            novoGrafico.setTitle(tituloView.getTitulo());
        }

    }

    @Override
    public JFreeChart getGrafico() {
        return novoGrafico;
    }

}
